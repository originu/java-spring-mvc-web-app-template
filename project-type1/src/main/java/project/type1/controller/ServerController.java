package project.type1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.type1.config.ServerConfig;
import project.type1.msg.ResMsg;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class ServerController {

	private final Logger logger = LoggerFactory.getLogger(ServerController.class);
	
	@Autowired
	private ServerConfig	config;
	
	@RequestMapping(value = "/server", method = RequestMethod.GET)
	public ResponseEntity<ResMsg<ObjectNode>> getServer() {
		ObjectNode res = JsonNodeFactory.instance.objectNode();
		res.put( "server.id", config.getServerId() );	
		res.put( "server.version", config.getServerVersion() );
		res.put( "PROJECT_HOME", config.getProjectHome().getPath() );
		logger.debug( "getServer() is executed: " + res.toString() ); 
		return new ResponseEntity<ResMsg<ObjectNode>>(
				new ResMsg< ObjectNode >(ResMsg.RESULT_CODE_SUCCESS, "success", res), 
				HttpStatus.OK
				);
	}
}