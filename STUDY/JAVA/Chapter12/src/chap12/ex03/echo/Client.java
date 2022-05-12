package chap12.ex03.echo; // code review 05-11

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		// 1. 소켓 생성(연결할 포트)
		Socket socket = new Socket("192.168.1.139", 5001); 
		// 연결 요청을 보낼 서버의 ip와 포트를 넣은 소켓을 생성 -> 소켓 생성하면 연결 요청이 된다.
		
		// 2. 데이터 전송(OutputStream)
		OutputStream os = socket.getOutputStream(); // 데이터를 내보내기 위해 outputstream을 socket에서 가져온다.
		ObjectOutputStream dos = new ObjectOutputStream(os); // 객체데이터를 다루는 보조 스트림 사용
		dos.writeUTF("Hello Server"); // 서버로 보내는 데이터를 utf 형식으로 보내준다.
		dos.flush(); // outputstream을 사용했으면 flush를 통해 남은 데이터가 없도록 털어내준다. 여기서 해줘야 안나가는 데이터가 없음
		
		// 3. 돌아온 데이터 수신(InputStream)
		InputStream is = socket.getInputStream(); // 데이터를 받아오기 위해 inputstream을 socket에서 가져온다. socket에서 stream 추출,사용
		ObjectInputStream dis = new ObjectInputStream(is); // // 객체데이터를 다루는 object 보조 스트림 사용
		String msg = dis.readUTF(); // 받아온 데이터를 String 타입 변수 msg 에 저장
		System.out.println(msg); // msg를 출력해준다. 서버에서 보낸 ("당신이 보낸 메시지 > " + msg
		
		// 4. 자원 반납
		dos.close(); // output stream 닫아주기 , flush는 위에서 해줬다.
		dis.close(); // input stream 닫아주기
		socket.close(); // socket 닫아주기
		

	}

}
