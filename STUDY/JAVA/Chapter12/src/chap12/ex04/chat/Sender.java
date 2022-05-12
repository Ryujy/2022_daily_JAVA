package chap12.ex04.chat;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//보내기 전용 스레드
public class Sender extends Thread {
	
	Socket socket = null; // 소켓 정보를 담아주기 위해 소켓 선언 및 null로 초기화
	
	public Sender(Socket socket) { //생성자
		this.socket = socket; // 받아온 값을 밖에서 선언한 socket에 담아준다. this로 구분해줌	
	}

	@Override
	public void run() {
		// 내가 메시지를 입력하면 그 내용을 OutputStream으로 전송
		Scanner scan = new Scanner(System.in); // 메시지를 입력하기 위해 scan 객체화
		ObjectOutputStream oos= null; // try-catch문 모두에서 사용하기 위해 밖에서 선언.
		try {
			OutputStream os = socket.getOutputStream(); // 입력받은 메시지를 내보내기 위해 소켓에서 OutputStream 을 가져온다.
			oos = new ObjectOutputStream(os); // 객체 보조스트림에 주스트림 탑승
			
			while (true) { 
				String msg = scan.nextLine(); // 보낼 메시지를 입력받는다.
				System.out.println("당신 > "+msg); // 어떤 메시지를 보냈는지도 보여준다.
				oos.writeUTF(msg); // UTF는 비교적 간단히 읽고쓸 수 있음 (다른 타입은 배열이나 변수에 담아서 옮겨야하는 반면)
				oos.flush(); // outputstream을 사용했다면 flush로 남은 데이터가 없도록 털어준다.
			}			
			
		} catch (IOException e) {
			e.printStackTrace();
			try {
				oos.close(); // 문제가 발생하면 스트림을 닫아준다. (자원반납)
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	
	

}















