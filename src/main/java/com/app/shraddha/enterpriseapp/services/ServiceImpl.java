package com.app.shraddha.enterpriseapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.app.shraddha.enterpriseapp.model.Message;
import com.app.shraddha.enterpriseapp.repository.MessageRepository;

@Component
public class ServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository msgRepo;

	@Override
	public Message addMessage(Message msg) {
		return msgRepo.save(msg);
	}

	@Override
	public Message getMessage(Integer msgId) {
		return msgRepo.findById(msgId).orElse(new Message());
	}

	@Override
	public Message updateMessage(Message msg,Integer msgId) {
		Message getPreviousMessage = getMessage(msgId);
		getPreviousMessage.setMsg(msg.getMsg());
		return msgRepo.save(getPreviousMessage);
	}

	@Override
	public List<Message> getMessages() {
		return msgRepo.findAll();
	}

	@Override
	public void deleteMessage(Integer msgId) {
		msgRepo.deleteById(msgId);
	}

}
