package chap12.ex05.file; 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Receiver {

	public static void main(String[] args) throws Exception {
		
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(8282);
		ExecutorService pool = Executors.newCachedThreadPool(); // 스레드 풀 생성
		
		while (true) {
			System.out.println("요청 대기");
			Socket socket =server.accept();
			System.out.println("요청 수락");
			
			
			/* Thread Pool 로 만들어보기 */
//			int n = Runtime.getRuntime().availableProcessors();
//			ExecutorService pool = Executors.newFixedThreadPool(n);
			
			// 스레드에서 해야 할 일
			Runnable job = new Runnable() {
				
				@Override
				public void run() {
					try {
						// 소켓에서 스트림 추출
						BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
						DataInputStream dis = new DataInputStream(bis);
						
						// 스트림에서 파일 명 추출
						String fileName = dis.readUTF();
						System.out.println("받을 파일 : " + fileName);
												
						// 스트림에서 파일 추출
						FileOutputStream fos = new FileOutputStream("c:/img/temp/" + fileName);
						BufferedOutputStream bos = new BufferedOutputStream(fos);
						
						// 네트워크 상황에서는 이렇게 해야 깨지지 않는다.
						int data = 0;
						while((data = dis.read()) != -1) {
							bos.write(data);  // 추출한 파일을 내 PC에 저장
						}
												
						// 자원 반납
						bos.flush();
						dis.close();
						bos.close();
						socket.close();						
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			};
			// 스레드 풀에서 스레드 요청
			pool.execute(job);
			
			/*
			// 스레드 생성 - 스레드 사용하는 이유는 여러 요청이 들어왔을 때 다 받아주기 위해서
			Thread th = new Thread() {

				@Override
				public void run() {
					try {
						// 소켓에서 스트림 추출
						BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
						DataInputStream dis = new DataInputStream(bis);				
						String fileName = dis.readUTF(); // 스트림에서 파일 명 추출
						System.out.println("받을 파일 : " + fileName);
												
						// 스트림에서 파일 추출
						FileOutputStream fos = new FileOutputStream("c:/img/temp/" + fileName);
						BufferedOutputStream bos = new BufferedOutputStream(fos);
						
						// 네트워크 상황에서는 이렇게 해야 깨지지 않는다.
						int data = 0;
						while((data = dis.read()) != -1) {
							bos.write(data);  // 추출한 파일을 내 PC에 저장
						}
												
						// 자원 반납
						bos.flush();
						dis.close();
						bos.close();
						socket.close();						
						
					} catch (IOException e) {
						e.printStackTrace();
					}				
				}				
			};
			th.start(); // 스레드 실행
			*/
			
		}
		

	}

}
