package chap10.ex04.filein;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInputMain {

	public static void main(String[] args) throws IOException {
		
		// 1. 파일 위치 지정
		String path = "C:/img/temp/news.txt";
		// 2. 파일 객체화 하기
		File file = new File(path);
		// 3. 스트림 준비
		FileInputStream fis = new FileInputStream(file);
		// 4. 스트림을 통해 파일 내용 읽어오기
		
		//EOF : End Of File : 파일을 더이상 읽을 수 없는 상태
		int data;
		//fis.read() 는 파일로부터 읽어온 값을 반환한다.
		/*
		while((data = fis.read()) != -1) { // -1 이 아닌 이상은 계속 불러와라. -1이 EOF를 뜻하기 때문!
			System.out.print((char)data); // 깨지는 이유 : 문자열은 문자열 전용 스트림을 써야 한글이 깨지지 않는다.
		}
		*/
		// 문자열을 다루기 위한 보조 스트림 사용
		InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
		while((data = reader.read()) != -1) { // -1 이 아닌 이상은 계속 불러와라. -1이 EOF를 뜻하기 때문!
			System.out.print((char)data);
		}
		// 5. 사용한 자원(Stream) 닫기
		fis.close();
		reader.close();
		
	}

}
