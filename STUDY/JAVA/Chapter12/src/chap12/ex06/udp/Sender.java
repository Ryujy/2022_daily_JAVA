package chap12.ex06.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Sender {

	public static void main(String[] args) throws Exception {
		
		// UDP는 DataGram 을 사용한다.
		// 1. DataGramSocket을 생성
		DatagramSocket socket = new DatagramSocket();
		System.out.println("발신 시작");
				
		// 2. 보낼 메시지 준비
		for (int i = 0; i < 3; i++) {
			String msg = "data" + i;
			byte[] arr = msg.getBytes();
			
			// 3. 데이터를 DatagramPacket 에 담는다.
			// byte[], length, (ip, port)
			DatagramPacket packet = new DatagramPacket(arr, arr.length, new InetSocketAddress("localhost", 5001));
		
			// 4. 데이터 전송
			socket.send(packet);
			
			
		} 
		// 5. 자원 정리
		socket.close();
		
		
		
		
	}

}
