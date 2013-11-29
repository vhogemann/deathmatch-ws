package ws.deathmatch.endpoint

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ws.server.endpoint.annotation.Endpoint
import org.springframework.ws.server.endpoint.annotation.PayloadRoot
import org.springframework.ws.server.endpoint.annotation.RequestPayload

import ws.deathmatch.service.DeathmatchService
import ws.deathmatch.xml.*

@Endpoint
class DeathmatchEndpoint {

	@Autowired
	private DeathmatchService service 
	
	@PayloadRoot( localPart = "request", namespace = "http://deathmatch.ws/service" )
	public DeathmatchResponse request( @RequestPayload DeathmatchRequest request ){		
		
		switch ( request.command ){
			case CMD.INSERTCOIN :
				return insertCoin();
			case CMD.UP :
				
			case CMD.DOWN :
			default :
				break;
		}
		return null
	}
	
	private DeathmatchResponse insertCoin(){
						
	}
	
}