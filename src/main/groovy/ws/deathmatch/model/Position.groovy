package ws.deathmatch.model

class Position {

    int width, height, x, y

    public Position(Position position){
        this.x = position.x
        this.y = position.y
        this.height = position.height
        this.width = position.width
    }

	public Position( int x, int y, int width, int height ){
		this.x = x
		this.y = y
        this.height = height
        this.width = width
	}
	
		
	static Position random( int maxx, int maxy ){

        int x = Math.floor( Math.random() * maxx )
		int y = Math.floor( Math.random() * maxy )
		
		return new Position(x, y, maxx, maxy)
		
	}

    boolean move( Direction direction ){
        boolean success = true

        switch( direction ){
            case Direction.UP :
                if( y > 0 )
                    y--;
                else
                    success = false
                break;
            case Direction.DOWN :
                if( y < width )
                    y++;
                else
                    success = false
                break;
            case Direction.RIGHT :
                if( x < width )
                    x++;
                else
                    success = false
                break;
            case Direction.LEFT :
                if( x > 0 )
                    x--;
                else
                    success = false
                break;
        }

        return success
    }
	
}
