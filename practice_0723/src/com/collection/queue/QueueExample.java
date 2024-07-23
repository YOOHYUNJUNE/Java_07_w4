package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue<Message> msgQueue = new LinkedList<>(); // 큐는 인터페이스
		
		msgQueue.offer(new Message("sendMail", "아무개"));
		msgQueue.offer(new Message("Call", "고길동"));
		msgQueue.offer(new Message("sendKakao", "홍길동"));
		msgQueue.offer(new Message("CallDeny", "임꺽정"));

		while(!msgQueue.isEmpty()) {
			Message msg = msgQueue.poll();
			switch(msg.getCommand()) {
			case "sendMail" : System.out.println(msg.getTo() + "에게 메일을 보냅니다.");
				break;
			case "Call" : System.out.println(msg.getTo() + "에게 전화합니다.");
				break;
			case "sendKakao" : System.out.println(msg.getTo() + "에게 카톡을 보냅니다.");
				break;
			case "CallDeny" : System.out.println(msg.getTo() + "을/를 차단합니다.");
				break;
			}
		}
		
		
		
		
	}
}
