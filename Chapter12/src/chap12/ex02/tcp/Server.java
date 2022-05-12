package chap12.ex02.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = null; // 서버에 대한 모든 정보
		
		try {
			server = new ServerSocket(5001); // 1. Server Socket 생성 (열어줄 포트)
			// 2. Client 요청 대기
			while(true) { // 요청이 언제 올지 모르니까 요청 올 때까지 무한대기
				System.out.println("요청 대기 중...");
				// 3. 클라이언트 요청에 따라 응답 또는 처리
				Socket socket = server.accept(); // 요청한 클라이언트에 대한 모든 정보 (서버소켓, 소켓 다른 거임)
				// 요청이 수락되면 요청한 클라이언트의 아이피와 포트를 알아내기
				InetSocketAddress addr = (InetSocketAddress) socket.getRemoteSocketAddress(); //원격지의 소켓을 이용한 주소 가져와
				System.out.println("접속 완료 >" + addr.getAddress()+":" + addr.getPort());
					
			}			
		} catch (IOException e) {
			e.printStackTrace();
			// 4. 할 일이 없으면 자원 반납
			server.close();
			System.out.println("연결 종료");
		}
		

	}

}
