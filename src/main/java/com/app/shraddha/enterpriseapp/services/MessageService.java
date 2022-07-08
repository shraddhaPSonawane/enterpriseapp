package com.app.shraddha.enterpriseapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.shraddha.enterpriseapp.model.Message;

@Service
public interface MessageService {

	public Message addMessage(Message msg);
	
	public Message getMessage(Integer msgId);
	
	public Message updateMessage(Message msg,Integer msgId);
	
	public List<Message> getMessages();
	
	public void deleteMessage(Integer msgId);
}
