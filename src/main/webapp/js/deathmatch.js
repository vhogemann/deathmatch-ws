angular.module('deathmatch',[])

.factory('BoardAPI', function($http){
	return {
		base : '/deathmatch-ws/',
		get : function(callback){
			return $http.get(this.base + 'rest/board').success(callback);
		}
	}
})

.directive('player',function(){
	return {
		restriction : 'A',
		scope : {
			player : '='
		},
		controller : function($scope, $element){
						
			$scope.getClass = function(){
				var name = [
				            'olaf', 	 //0
				            'siegfried', //1
				            'bjorn',     //2
				            'hagar'      //3
				       ]
				
				var status = $scope.player.status == "ALIVE" ? "dwarf" : "skeleton";
				var name = name[$scope.player.id % 4];
				var direction = $scope.player.direction.toLowerCase();
				
				return status + " " + name + " " + direction;
			}
			
			$scope.getPosition = function(){
				var resolution = 96;
				
				var top = $scope.player.position.y * resolution;
				var left = $scope.player.position.x * resolution;
				
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
			$timeout(tick, 1000);
		});
	}	
	$timeout(tick, 1000); 
});