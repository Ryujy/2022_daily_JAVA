package chap10.ex06.CharIO;

import java.io.FileWriter;
import java.io.IOException;

public class TextOut {

	public static void main(String[] args) throws IOException {
		
		// 1. 내보낼 파일 위치 지정 + 스트림 준비
		FileWriter writer = new FileWriter("c:/img/temp/test.txt", true); // 2번재 인자값 : 이어쓰기 여부
		
		// 2. 내보내기
		writer.write("기록 시작 \r\n");
		for (int i = 1; i <= 10; i++) {
			writer.write("for문 증가 : "+i+ "\r\n");
		}
		writer.write("기록 종료 \r\n");
		
		// 3. 자원 반납(flush, close)
		writer.flush();
		writer.close();

	}

}
