package chap12.ex04.chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

// 받기 전용 스레드
public class Receiver extends Thread {
	
	Socket socket = null; // 소켓 정보를 담아주기 위해 소켓 선언 및 null로 초기화
	
	public Receiver(Socket socket) { //생성자
		this.socket = socket; // 받아온 값을 이 클래스 안 어디서든 사용하기 위해서 밖에서 선언한 socket에 담아준다. this로 구분해줌
	}

	@Override
	public void run() {
		// 누군가 메시지를 주면 그 내용을 InputStream으로 받아옴
		ObjectInputStream ois = null;  // try-catch문 모두에서 사용하기 위해 밖에서 선언.
		
		try {
			ois = new ObjectInputStream(socket.getInputStream()); // 보조스트림에 소켓에서 가져온 스트림 바로 탑승 , 문자열을 간단하게 읽어오기 위함
			
			while(true) { // 메시지를 반복해서 읽어오도록 한다.
				String msg = ois.readUTF(); // UTF는 비교적 간단히 읽고쓸 수 있음 (다른 타입은 배열이나 변수에 담아서 옮겨야하는 반면) 단, 상대방이 자바여야함
				System.out.println("상대 > " + msg); // 상대가 보낸 메시지를 보여주는 출력문
			}
			
		} catch (IOException e) {
			try {
				ois.close(); // 문제 발생시 자원 반납. 만약 while 문에 close 가 들어가면 한 번 밖에 통신이 안됨
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
	

}
