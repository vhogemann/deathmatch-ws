package ws.deathmatch.model

class Player {
	
	int id
	
	Direction direction
	
	Position position
	
	Status status

}

enum Direction {
	UP, DOWN, LEFT, RIGHT
}

enum Status {
	ALIVE, DEAD
}