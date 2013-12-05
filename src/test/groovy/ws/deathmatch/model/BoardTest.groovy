package ws.deathmatch.model

import static org.junit.Assert.*;

import org.junit.Test;

class BoardTest {

	@Test
	void testNewPlayer(){
		Board board = new Board()
		Player player = board.newPlayer()
		assert player
	}
	
	@Test
	void testTurn(){
		Board board = new Board()
		
		Player player = board.newPlayer()
		assert player.direction == Direction.DOWN	
		
		board.turn(0, Direction.UP)
		assert player.direction == Direction.UP
	}
	
	@Test
	void testMove(){
		Board board = new Board()
		Player player = board.newPlayer()
		
		player.position = new Position(0, 0, 8, 8)
		
		board.move(0)
		
		assert player.position.y == 1
		
		board.turn(0, Direction.RIGHT)
		board.move(0)
		
		assert player.position.x == 1
		
		board.turn(0, Direction.UP)
		board.move(0)
		
		assert player.position.y == 0
		
		board.turn(0, Direction.LEFT)
		board.move(0)
		
		assert player.position.x == 0
		
	}
		
}
