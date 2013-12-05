package ws.deathmatch.model

abstract class Entity{
	Direction direction
	Position position

    boolean move(){
        return position.move( direction )
    }
}

class Player extends Entity {

	int id
	
	String secret
	
	Status status = Status.ALIVE

    Projectile projectile
	
	Player( int maxx, int maxy ){
		position = Position.random( maxx, maxy)
		direction = Direction.DOWN
		secret = UUID.randomUUID().toString()
	}

    void shoot(){
        //Players allowed to shoot one fireball at time
        if( !projectile ) {
            projectile = new Projectile( this )
        }
    }

    /**
     * Updates internal state, currently only the projectile.
     * If the projectile does not move, it must have hit a wall
     * so we remove it
     */
    void tick(){
        if( projectile && !projectile.move() ){
            projectile = null
        }
    }

}

class Projectile extends Entity {

    Projectile( Player player ){
        this.direction = player.direction
        this.position = new Position( player.position )
    }

}

enum Direction {
	UP, DOWN, LEFT, RIGHT
}

enum Status {
	ALIVE, DEAD
}