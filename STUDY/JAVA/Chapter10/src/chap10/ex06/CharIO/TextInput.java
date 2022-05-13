package chap10.ex06.CharIO;

import java.io.FileReader;
import java.io.IOException;
// 안쓰는 import 문 ctrl shift o

public class TextInput {

	public static void main(String[] args) throws IOException {
		
		// 순서
		
		// 1. 읽어올 파일 위치 지정		
		String path = "C:/img/temp/news.txt";
		
		// 2. 읽어올 스트림 준비
		FileReader reader = new FileReader(path);
		
		// 3. 읽어와서 출력하기
		int data;
		while((data=reader.read()) != -1) {
			System.out.print((char)data);
		}
		
		// 4. 자원 닫기
		reader.close();

	}

}
