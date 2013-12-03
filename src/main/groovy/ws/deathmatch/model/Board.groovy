package ws.deathmatch.model

import java.util.List

class Board {
	
	int width = 8
	int height = 8
	
	List<Player> players = [ ]
	
	Player newPlayer(){
		def player = new Player(width, height)
		players << player
		player.id = players.indexOf(player)
		
		return player
	}
	
	void kill(int id){
		if( players.size() < id )
			players[id].status = Status.DEAD
	}
	
	void move(int id){
		Player player = players[id]
		
		int x = player.position.x
		int y = player.position.y
		 
		switch( player.direction ){
			case Direction.UP :
				if( y > 0 ) y--; break;
		    case Direction.DOWN :
				if( y < width ) y++; break;
			case Direction.RIGHT :
				if( x < width ) x++; break;
			case Direction.LEFT :
				if( x > 0 ) x--; break;
		}
		
		player.position.x = x
		player.position.y = y
			
	}
	
	void shoot(int id){
		
	}
	
	void turn(int id, Direction direction){
		players.get(id).direction = direction
	}
	
}
