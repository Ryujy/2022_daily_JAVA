package chap12.ex05.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Sender {

	public static void main(String[] args) throws Exception {
		
		// JAVA I.O. 에서 파일 읽어오고 내보내는 순서
		
		// 1. 파일 위치 지정
		String path = "c:/img/image.jpg";
		// 2. 스트림 준비 (주 스트림 + 보조스트림)
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 소켓 준비
		Socket socket = new Socket("127.0.0.1", 8282); // localhost = 127.0.0.1
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream()); // 버퍼 추가
		DataOutputStream dos = new DataOutputStream(bos);
		
		// 파일명 전송
		String depth[] = path.split("/");
		dos.writeUTF(depth[depth.length-1]);
		dos.flush();
		
		// 3. 읽어오고 (FileInputStream)
		byte[] arr = new byte[1024];
		while(bis.read(arr) != -1) {
			dos.write(arr);   // 4. 내보낸다. (socket.getOutputStream())
		}
		// 4. 자원 반납
		dos.flush();
		dos.close();
		bis.close();
		socket.close();

	}

}
