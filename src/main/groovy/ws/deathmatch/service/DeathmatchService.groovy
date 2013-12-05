package ws.deathmatch.service

import org.springframework.stereotype.Service

import ws.deathmatch.model.Board
import ws.deathmatch.model.Direction
import ws.deathmatch.model.Player


class DeathmatchService {

	private Board board = new Board()		
	
	Board turn( int id, Direction direction ){
		board.turn(id, direction);
		return board;
	}
	
	Board move( int id ){
		board.move(id)
		return board
	}
	
	Board shoot( int id ){
        board.shoot(id)
		return board
	}
		
	Player insertCoin( ){
		return board.newPlayer()
	}

    Board tick() {
        return board
    }
}
