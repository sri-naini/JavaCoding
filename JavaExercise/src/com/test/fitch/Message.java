package com.test.fitch;

public class Message {

	String msg;
	String type;
	int priority;
	
	public Message(String msg, String type, int priority) {
		super();
		this.msg = msg;
		this.type = type;
		this.priority = priority;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Message [msg=" + msg + ", type=" + type + ", priority="
				+ priority + "]";
	}
	
	
	 
}
