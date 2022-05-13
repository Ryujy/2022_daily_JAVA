package chap10.ex09.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferNotUse {

	public static void main(String[] args) throws IOException {
		
		TimeChecker chk = new TimeChecker();
		// c:/img/001.png -> c:/img/temp/002.png
		
		// 1. 가져올 파일과 내보낼 파일 위치 지정
		String src = "c:/img/001.png";
		String dest = "c:/img/temp/002.png";
		
		// 2. 스트림 준비
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		
		/* 시간 측정 시작 */
		chk.timeStart();
		// 3. 가져오기
		int data;
		while((data=fis.read()) != -1) {
			System.out.println("복사중...");
			fos.write(data);	 // 4. 내보내기
		}
		/* 시간 측정 종료 */
		System.out.println("버퍼 미사용 시 : "+chk.timeStop()+"ms");  //8,504 ms
		// 5. 자원 반납 (flush, close)
		fos.flush();
		fis.close();
		fos.close();

	}

}
