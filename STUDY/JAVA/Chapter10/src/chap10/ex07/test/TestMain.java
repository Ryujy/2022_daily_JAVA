package chap10.ex07.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws IOException {
		// Scanner 로 입력받은 내용을 sample.txt 파일에 저장
		
		// 1. 내보낼 파일 위치 지정 + 2. 스트림 준비
		FileWriter writer = new FileWriter("c:/img/temp/sample.txt", true);
		
		// 3. scanner 준비 
		System.out.print("내용 입력 > ");
		Scanner scan = new Scanner(System.in);
		String strResult = scan.nextLine() + "\r\n";
	
		// 4. 내보내기
		writer.write(strResult);
		System.out.println("내용 내보내기 완료!");
		
		// 5. 자원 반납 (flush, close)
		writer.flush();
		writer.close();

	}

}
