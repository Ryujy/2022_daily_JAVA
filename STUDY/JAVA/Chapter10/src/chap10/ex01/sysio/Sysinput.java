package chap10.ex01.sysio;

import java.io.IOException;
import java.io.InputStream;

public class Sysinput {

	public static void main(String[] args) {
		
		System.out.println("아무거나 입력 하세요!");
		InputStream is = System.in; // 키보드로 입력 받음
		
		// 읽기
		try {
			int result = is.read();
			System.out.println(result+ " => " + (char)result);

		} catch (IOException e) {
			e.printStackTrace(); // 개발할 땐 편한데 끝나면 보안상 좋지 않음 그니까 개발 끝나면 주석처리
		}

	}

}
