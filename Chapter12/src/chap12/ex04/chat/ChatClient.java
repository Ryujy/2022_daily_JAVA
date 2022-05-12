package chap12.ex04.chat; // code review 05-12

import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) throws Exception {
		// 1. 소켓 생성
		Socket socket = new Socket("192.168.1.141", 7777); // 접속할 서버의 ip주소와 포트번호로 소켓을 생성하면 접속 요청이 된다.
		System.out.println("서버 접속 완료"); // 가시적으로 알려준다.
		
		// 메시지 보내기 전용
		Sender sender = new Sender(socket); // sender를 객체화할 때 socket을 담아서 가져온다.
		sender.start(); // sender 스레드 시작
		
		// 메시지 받기 전용
		Receiver receiver = new Receiver(socket); // socket을 담아서  receiver를 객체화한다.
		receiver.start(); // receiver 스레드 시작

	}

}
