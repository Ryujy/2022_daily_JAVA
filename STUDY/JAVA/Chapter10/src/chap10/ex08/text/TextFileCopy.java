package chap10.ex08.text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TextFileCopy {

	public static void main(String[] args) throws IOException {
		
		// 1. 읽어올 파일과 내보낼 파일 위치 지정
		String src = "c:/img/temp/news.txt";
		String dst = "c:/img/news2.txt";
		
		// 2. 스트림 준비
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		// 위의 스트림만 이용하면 문자열 전용 스트림이 아니기 때문에 한글은 다 깨질 수가 있다.
		// 그래서 우리는 문자열 전용 보조스트림을 사용할 예정
		InputStreamReader reader = new InputStreamReader(fis, "UTF-8"); // fileinputstream 은 inputstream 의 자식 = 매개변수 다형성
		OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8"); // 주스트림(fis) 이 보조스트림에 탑승
		System.out.println("복사시작");
		// 3. 읽어와서 내보내기
		char[] arr = new char[1024];
		while(reader.read(arr) != -1) {
			writer.write(arr); // 내보내기
		}
		System.out.println("복사완료");
		
		// 4. 자원 정리 ( flush, close)
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
