package ws.deathmatch.service

import org.springframework.stereotype.Service

import ws.deathmatch.model.Board
import ws.deathmatch.model.Player;
import ws.deathmatch.model.Status;
import ws.deathmatch.xml.DeathmatchRequest
import ws.deathmatch.xml.DeathmatchResponse
import ws.deathmatch.xml.CommandEnum as CMD
import ws.deathmatch.xml.DeathmatchResponse.Player.Coords;

@Service
class DeathmatchService {

	private Board board = new Board()		
	
	public DeathmatchResponse executeCommand( DeathmatchRequest request ){
		//TODO
		switch ( request.command ){
			case CMD.INSERTCOIN :
			case CMD.UP :
			case CMD.DOWN :
			default :
				break;
		}
		
	}
	
	DeathmatchResponse insertCoin( DeathmatchRequest request ){
		
		Player player = board.newPlayer()
		
		DeathmatchResponse response = new DeathmatchResponse()
		
		response.player = new ws.deathmatch.xml.DeathmatchResponse.Player()
		response.player.id = player.id
		
		response.player.coords = new Coords()
		response.player.coords.x = player.position.x
		response.player.coords.y = player.position.y
		
		return response
	}
	
	
}
