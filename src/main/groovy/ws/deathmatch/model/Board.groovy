package ws.deathmatch.model

import java.util.List

class Board {
	
	int width = 7
	int height = 7
	
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
        players.get(id).move()
	}
	
	void shoot(int id){
		players.get(id).shoot()
	}

	void turn(int id, Direction direction){
		players.get(id).direction = direction
	}

    void tick(){
        players.each{ it.tick() }
    }
	
}
