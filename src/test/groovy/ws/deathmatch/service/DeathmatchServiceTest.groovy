package ws.deathmatch.service

import org.junit.Test;

import ws.deathmatch.model.Board;
import ws.deathmatch.model.Player;

class DeathmatchServiceTest {

	
	@Test
	void testInsertCoin(){
		DeathmatchService service = new DeathmatchService()
		
		Player player = service.insertCoin()
		
		assert player
		assert player.id == 0
		assert service.board.players.size() == 1
		assert player.secret == service.board.players[player.id].secret
		
		player = service.insertCoin()
		assert player
		assert player.id == 1
		assert service.board.players.size() == 2
		assert player.secret == service.board.players[player.id].secret
				
	}
	
	void testTurn(){
		DeathmatchService service = new DeathmatchService()				
	}
	
	void testMove(){
		
	}
	
}
