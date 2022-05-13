package chap12.ex06.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {

	public static void main(String[] args) throws Exception {
		
		// 1. DatagramSocket 준비
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket(5001);
			
			// 받기를 기다린다.
			while(true) {
				System.out.println("수신 대기");
				// 2.데이터를 받을 DatagramPacket 준비
				DatagramPacket packet = new DatagramPacket(new byte[100], 100); // 데이터를 받아줄 배열과 크기 지정
				
				// 3. 데이터 수신
				socket.receive(packet);
				byte[] data = packet.getData();
				
				// 4. 수신내용 확인
				String msg = new String(data).replace('\0',' '); // 네모('\0')를 공백(' ')으로 바꿔준다.
				System.out.println(msg);
				
				
			}
		} catch (Exception e) {
			// 5. 자원 정리
			socket.close();
		}
			
			
		}
		
	}

