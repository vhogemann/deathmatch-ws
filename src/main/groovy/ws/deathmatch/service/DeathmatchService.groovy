package ws.deathmatch.service

import org.springframework.stereotype.Service

import ws.deathmatch.model.Board
import ws.deathmatch.model.Status;
import ws.deathmatch.xml.DeathmatchRequest
import ws.deathmatch.xml.DeathmatchResponse
import ws.deathmatch.xml.CommandEnum as CMD

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
	
	public Board kill( int playerId  ){
		board.players.find{ it.id == playerId }?.status = Status.DEAD
		return board
	}
	
}
