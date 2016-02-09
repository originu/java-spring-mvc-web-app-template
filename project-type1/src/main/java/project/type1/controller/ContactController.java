package project.type1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.type1.dto.ContactDto;
import project.type1.msg.ResMsg;
import project.type1.service.impl.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService	service;
	
	@RequestMapping(value = "/contacts/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResMsg<ContactDto>> getContact(@PathVariable("id") long id) {
		ContactDto contactDto = service.get(id);
		if ( contactDto != null ) {
			return new ResponseEntity<ResMsg<ContactDto>>( 
					new ResMsg<ContactDto>( "0000", "success", contactDto), HttpStatus.OK );  
		} else {
			return new ResponseEntity<ResMsg<ContactDto>>( HttpStatus.NOT_FOUND );  
		}
	}
}
