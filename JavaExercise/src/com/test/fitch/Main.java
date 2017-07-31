package com.test.fitch;

public class Main {
	
	public static void main(String[] args) {
		
		Messages msgs = new Messages(new CallBackImpl());
		
		Message msg1 = new Message("msg1", "red", 1);
		msgs.add(msg1);
		
		Message msg2 = new Message("msg2", "'yellow'", 1);
		msgs.add(msg2);
		
		Message msg3 = new Message("msg3", "blue", 1);
		msgs.add(msg3);
		
		Message msg4 = new Message("msg4", "red", 2);
		msgs.add(msg4);
		
		Message msg5 = new Message("msg5", "'yellow'", 2);
		msgs.add(msg5);
		
		Message msg6 = new Message("msg6", "blue", 3);
		msgs.add(msg6);
		
		Message msg7 = new Message("msg7", "red", 2);
		msgs.add(msg7);
		
		Message msg = msgs.getHighPriByMsgType("red");
		
		System.out.println(msg);
		
		msgs.delHighPriMsg(msg);
		
	}

}
