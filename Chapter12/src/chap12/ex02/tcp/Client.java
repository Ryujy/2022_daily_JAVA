package chap12.ex02.tcp;

import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.1.139", 5001); // 1. 소켓 생성 + 2. 연결 요청
			System.out.println("connect success!!"); // 3. 예외 발생하지 않으면 연결이 완료
			
		}  catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4. 자원 반납
			socket.close();
			System.out.println("disconnect!!");
		}

		
		

	}

}
