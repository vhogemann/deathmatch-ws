package ws.deathmatch.model

class Position {
	int x
	int y

	public Position(){}
	
	public Position( int x, int y ){
		this.x = x
		this.y = y
	}
	
		
	static Position random( int maxx, int maxy ){

		int x = Math.floor( Math.random() * maxx )
		int y = Math.floor( Math.random() * maxy )
		
		return new Position(x,y)
		
	}
	
}
