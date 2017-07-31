package com.test.fitch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Messages {

	List<Message> msgs = new LinkedList<Message>();
	
	public List<Message> getMsgs() {
		return msgs;
	}

	public void setMsgs(List<Message> msgs) {
		this.msgs = msgs;
	}

	CallBack cb;
	
	Messages(CallBack cb) {
		this.cb = cb;
	}
	
	public void add(Message message) {
		msgs.add(message);
		cb.justPrint("Message added", message.msg);
	}


	
	public Message getHighPriByMsgType(String type) {
		
		Message msg = null;
		try {
			if (!(type == null)) {
				List<Message> subList = new ArrayList<Message>();
				subList = msgs.stream().filter(line -> type.equals(line.getType())).collect(Collectors.toList());
				subList.sort(Comparator.comparing(Message::getPriority).reversed());
				msg = subList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	public Message delHighPriMsg(Message msg) {

		try {
			if (!(msg == null)) {
				msgs.remove(msg);
				cb.justPrint("Message deleted", msg.msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

}
