package com.app.shraddha.enterpriseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.shraddha.enterpriseapp.model.Message;
import com.app.shraddha.enterpriseapp.services.MessageService;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

	@Autowired
	private MessageService msgService;
	
	@GetMapping("/messages")
	public List<Message> getAllMessages(){
		return msgService.getMessages();
	}
	
	@GetMapping("/messages/{msgId}")
	public Message getMessage(@PathVariable Integer msgId){
		return msgService.getMessage(msgId);
	}
	
	@PostMapping("/messages")
	public Message addMessage(@RequestBody Message msg){
		return msgService.addMessage(msg);
	}
	
	@PutMapping("/messages/{msgId}")
	public Message updateMessage(@RequestBody Message msg,@PathVariable Integer msgId){
		return msgService.updateMessage(msg,msgId);
	}
	
	@DeleteMapping("/messages/{msgId}")
	public void deleteMessage(@PathVariable Integer msgId){
		 msgService.deleteMessage(msgId);
	}
}
