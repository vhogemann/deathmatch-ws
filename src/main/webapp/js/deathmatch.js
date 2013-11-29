angular.module('deathmatch',[ ])

.factory('BoardAPI', function($http){
	return {
		base : '/deathmatch-ws/',
		get : function(callback){
			return $http.post(this.base + 'rest/board').success(callback);
		}
	}
})

.factory('EntityService', function(){
	
	var name = [
         'olaf', 	  //1
         'siegfried', //2
         'bjorn',     //3
         'hagar',     //4
         'skeleton',  //0
    ]
	var board_size = 8;//x8
	var tile_size = 96;//px
	var length = tile_size * board_size;
	
	var position = function ( x, y ){
		
	}
	
	return {
		init : function( id, position, direction ){
			
		},
		update : funciton ( entity ){
			
		}
	}
})
.controller('BoardCtrl',function( $scope, $timeout, BoardAPI, EntityService ){
	
	$scope.entities = [];
	
	var tick = function(){
		
	}	
	
	$timeout(tick, 1000); 
});