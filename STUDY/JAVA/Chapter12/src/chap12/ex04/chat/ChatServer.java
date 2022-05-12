package chap12.ex04.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		
		ServerSocket server = null;	// 서버소켓을 사용하기 위해 변수 정의 및 초기화
		
		try {
			server = new ServerSocket(7777); //1. 서버소켓 생성 (7777 포트 개방)
			
			System.out.println("접속 요청 대기"); // 서버가 클라이언트의 요청을 대기하고 있다는 문구를 출력해준다.
			
			Socket socket = server.accept(); //2. 요청 대기, 요청수락 (accept) -> 소켓을 얻는다.
			// 소켓에는 클라이언트의 주소(ip,port)가 들어 있음
			System.out.println("접속 수락"); // 클라이언트의 접속 요청을 수락했음을 알려주기 위한 출력문
			
			/* 서버와 클라이언트 양쪽에서 메시지를 주고받기 위해서는 서버와 클라이언트 둘 다
			 * 메시지를 보내기 위해 접속 요청을 하는 Sender와
			 * 메시지를 받기 위해 접속 요청을 기다리는 Receiver가 상시 필요하다.
			 * 따라서 멀티스레드를 이용하여 Sender와 Receiver를 생성, 사용한다.
			 *  */
			// 메시지 보내기 전용
			Sender sender = new Sender(socket);  // sender를 객체화할 때 socket을 담아서 가져온다.
			sender.start(); // sender를 시작
			
			// 메시지 받기 전용
			Receiver receiver = new Receiver(socket); // socket을 담아서 Receiver를 객체화
			receiver.start(); // 시작
			// 단, 일대일 채팅이기 때문에 약속된 사람하고만 해야함
			
			
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		

	}

}
