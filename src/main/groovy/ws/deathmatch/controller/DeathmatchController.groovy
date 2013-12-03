package ws.deathmatch.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import ws.deathmatch.controller.command.KillCommand;
import ws.deathmatch.model.Board
import ws.deathmatch.service.DeathmatchService

@Controller
class DeathmatchController {
	
	@Autowired
	private DeathmatchService service
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	@ResponseBody
	Board getBoard(){
		return service.board
	}
	
	@RequestMapping( value = "/board", method = RequestMethod.PUT )
	@ResponseBody
	Board updateBoard( @RequestBody KillCommand body ){
		return service.kill( body.playerId )
	}
	
	
	
}
