package ws.deathmatch.model

class Board {
	
	int width = 8
	int height = 8
	
	List<Player> players = [ ]
	
	Player newPlayer(){
		def player = new Player()
		players << player
		return player
	}
	
	void kill(Player player){
		
	}
	
	void move(Player player){
		
	}
	
	void turn(Player player, Direction direction){
		
	}
	
}
