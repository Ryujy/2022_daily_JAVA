package chap12.ex07.webserver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServerMain {

	public static void main(String[] args) throws IOException {
		// 웹서버는 하나의 서버에 여러 요청이 들어온다.
		// 이 경우 스레드 풀을 사용한다. (효율성)
		ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		ServerSocket server = new ServerSocket(80); //web에서는 80이 기본 포트여서 빈 칸이면 80이라 생각하면 됨
		
		while(true) {
			System.out.println("서버 접속 요청 대기");
			Socket socket = server.accept();
			System.out.println("접속 수락");
			
			Runnable job = new Runnable() {
				
				@Override
				public void run() {
					// 소켓에서 스트림 추출
					try {
						BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
						// 추출한 데이터 확인
						byte[] arr = new byte[65536]; // 받을 수 있는 최대 바이트 수 (http protocol)
						bis.read(arr); 
						String request = new String(arr); // 요청
						System.out.println(request);
						
						// 응답 만들기
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						// 헤더(통신 규약에 대한 정보)
						ps.print("HTTP/1.1 200 \r\n");
						ps.print("Content-type: text/html \r\n");
						ps.print("\r\n");
						// 바디(html 등 화면에 뿌려줄 데이터)
						String body = "<h3>Success!!</h3>";
						byte[] resp = body.getBytes();
						ps.write(resp, 0, resp.length);
						ps.flush();
						ps.close();
						bis.close();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
				}
			};
			
			pool.execute(job);
		}
		
		
	}

}
