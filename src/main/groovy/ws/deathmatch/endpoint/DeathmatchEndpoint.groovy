package ws.deathmatch.endpoint

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ws.server.endpoint.annotation.Endpoint
import org.springframework.ws.server.endpoint.annotation.PayloadRoot
import org.springframework.ws.server.endpoint.annotation.RequestPayload
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ws.deathmatch.model.Board
import ws.deathmatch.model.Player
import ws.deathmatch.model.Direction
import ws.deathmatch.service.DeathmatchService
import ws.deathmatch.xml.*
import ws.deathmatch.xml.DeathmatchResponse.Player.Coords;
import ws.deathmatch.xml.CommandEnum as CMD;


@Endpoint
class DeathmatchEndpoint {

	@Autowired
	private DeathmatchService service 
	
	@PayloadRoot( localPart = "DeathmatchRequest", namespace = "http://deathmatch.ws/service" )
	public @ResponsePayload DeathmatchResponse request( @RequestPayload DeathmatchRequest request ){		
		
		switch ( request.command ){
			case CMD.INSERTCOIN :
				return insertCoin();
			case CMD.UP :
				 return turn( request.player, Direction.UP )
			case CMD.DOWN :
				return turn( request.player, Direction.DOWN )
			case CMD.LEFT:
				return turn( request.player, Direction.LEFT )
			case CMD.RIGHT:
				return turn( request.player, Direction.RIGHT )
			case CMD.WALK:
				return move( request.player )
			
		}
		return null
	}
	
	private DeathmatchResponse move( int id ){
		return toResponse( service.move(id) )
	}
	
	private DeathmatchResponse turn( int id, Direction direction ){
		return toResponse( service.turn(id, direction) )
	}
	
	private DeathmatchResponse insertCoin(){
		Player player = service.insertCoin()
		return toResponse( service.board )
	}
	
	private DeathmatchResponse toResponse ( Board board ){
		DeathmatchResponse response = new DeathmatchResponse()
		response.player = board.players.collect { player ->
			ws.deathmatch.xml.DeathmatchResponse.Player p = new ws.deathmatch.xml.DeathmatchResponse.Player()
			p.id = player.id
			p.secret = player.secret
			p.coords = new Coords()
			p.coords.x = player.position.x
			p.coords.y = player.position.y
			p.direction = DirectionEnum.values().find { "$it" == "${player.direction}" }
			
			return p
		} as List
		return response
	}
	
}