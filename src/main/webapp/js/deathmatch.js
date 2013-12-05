angular.module('deathmatch',[])

.factory('BoardAPI', function($http){
	return {
		base : '/deathmatch-ws/',
		get : function(callback){
			return $http.get(this.base + 'rest/board').success(callback);
		}
	}
})

.directive('entity',function(){
	return {
		restriction : 'A',
		scope : {
			entity : '=',
			fireball : '@'
		},
		controller : function($scope, $element){

			$scope.getClass = function(){

                var direction = $scope.entity.direction.toLowerCase();

                if( $scope.fireball )
                    return 'fireball ' + direction;

				var name = [
				            'olaf', 	 //0
				            'siegfried', //1
				            'bjorn',     //2
				            'hagar'      //3
				       ]
				
				var status = $scope.entity.status == "ALIVE" ? "dwarf" : "skeleton";
				var name = name[$scope.entity.id % 4];
				
				return status + " " + name + " " + direction;
			}
			
			$scope.getPosition = function(){
				var resolution = 96;

				var top = $scope.entity.position.y * resolution;
				var left = $scope.entity.position.x * resolution;
				
				return " left: " + left + "px; top: " + top + "px;";
				
			}
			
		}
	}
})

.controller('BoardCtrl',function( $scope, $timeout, BoardAPI){
	$scope.entities = [];
	var tick = function(){
		console.log('tick');
		BoardAPI.get(function(data){
			$scope.entities = data.players;
			$scope.fireballs = [];
			angular.forEach( $scope.entities, function( entity ){
                if(entity.projectile){
                    $scope.fireballs.push(entity.projectile);
                }
			});
			$timeout(tick, 1000);
		});
	}	
	$timeout(tick, 1000); 
});