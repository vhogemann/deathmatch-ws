package ws.deathmatch.model

abstract class Entity{
	Direction direction
	Position position
}

class Player extends Entity {
	
	int id
	
	String secret
	
	Status status = Status.ALIVE
	
	Player( int maxx, int maxy ){
		position = Position.random( maxx, maxy)
		direction = Direction.DOWN
		secret = UUID.randomUUID().toString()
	}

}

class Projectile extends Entity {
	Player player
}

enum Direction {
	UP, DOWN, LEFT, RIGHT
}

enum Status {
	ALIVE, DEAD
}