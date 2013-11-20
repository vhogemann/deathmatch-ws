angular.module('deathmatch',[ ])

.factory('BoardAPI', function($http, PlayerService){
	
})

.factory('PlayerService', function(){
	
	var name = [
         'skeleton',  //0
         'olaf', 	  //1
         'siegfried', //2
         'bjorn',     //3
         'hagar',     //4
    ]
	var board_size = 8;//x8
	var tile_size = 96;//px
	var length = tile_size * board_size;
	
	var position = function ( x, y ){
		
	}
	
	return {
		initPlayer : initPlayer( player )
	}
})
.controller('BoardCtrl',function( $scope, $timeout, BoardAPI ){
	
});