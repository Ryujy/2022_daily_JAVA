package chap12.ex03.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = null; // 서버소켓 - 서버소켓은 서버에 대한 모든 정보를 담고있다.
		//try 안에서 정의하면 catch 에서 server 변수 사용할 수 없기 때문에 여기서 선언 및 초기화 해준다.
		
		try {
			server = new ServerSocket(5001); // 1. 서버소켓 생성(포트 개방)
			// 2. 클라이언트 요청 대기
			while(true) { // 클라이언트가 언제올지 모르기 때문에 올 때까지 무한대기
				System.out.println("요청 대기..."); // 서버가 클라이언트의 요청을 대기하고 있다는 문구를 출력해준다.
				Socket socket = server.accept(); // 3. 요청수락(소켓을 얻는다.) 소켓 = 요청한 클라이언트의 모든 정보 / accept가 blocking 역할 -> 요청대기 반복해서 찍히지않고  한 번만 찍힌 후 대기
				InetSocketAddress addr = (InetSocketAddress) socket.getRemoteSocketAddress(); 
				// socket에서 원격지주소소켓을 가져와라
				// 얻은 소켓에서 클라이언트의 주소(아이피와 포트)정보를 가져온다. addr 에 저장
				System.out.println(">>" + addr.getAddress()+" : "+addr.getPort()); // addr에서 클라이언트의 ip, port 정보를 가져와서 출력
				
				// 4. 읽어오기 (소켓으로부터 InputStream 추출)
				InputStream is = socket.getInputStream(); // 데이터를 가져오기 위해 inputstream을 socket에서 가져온다.
				ObjectInputStream ois = new ObjectInputStream(is); // 객체데이터를 다루는 보조스트림 사용 (쉽게보내기 위함)
				String msg = ois.readUTF(); // readUTF 는 어떤 문자열이든 편하게 주고받을 수 있음 단, 상대도 자바
				System.out.println(addr.getAddress()+" > " + msg); //msg를 출력 -> 클라이언트가 보낸 메시지를 서버에서 보여준다.
				
				// 5. 내보내기 (소켓으로부터 OutputStream 추출)
				OutputStream os = socket.getOutputStream(); // 데이터를 내보내기 위해 outputstream을 socket에서 가져온다.
				ObjectOutputStream oos = new ObjectOutputStream(os); // 객체데이터를 다루는 보조스트림 사용
				oos.writeUTF("당신이 보낸 메시지 > " + msg); // 클라이언트한테 내보낸다. 클라이언트가 볼 수 있음
				
				// 6. 자원반납 (flush, stream close, socket close)
				oos.flush();  // 데이터를 내보내면 flush로 남은 데이터를 털어내준다.
				oos.close(); // 자원 반납을 위해 output stream 닫기
				ois.close(); // input stream 닫기
				socket.close(); //socket도 닫아준다.
				
			}		
		} catch (IOException e) { //try 부분에서 exception이 발생하면 catch로 잡아준다.
			e.printStackTrace();
			server.close();  // 만약 문제 발생시 서버 종료
		}

	}

}
