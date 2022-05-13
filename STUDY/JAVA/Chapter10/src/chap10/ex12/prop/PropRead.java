package chap10.ex12.prop;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropRead {

	public static void main(String[] args) throws IOException {
		// 1. 파일 위치 지정
		String path = "src/chap10/ex12/prop/profile.properties";
		
		// 2. 주 스트림 + 보조 스트림 준비
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
		// 3. Properties 객체 준비
		Properties prop = new Properties();
		
		// 4. 가져오기
		prop.load(bis);
		
		// 5. 읽기
		System.out.println(prop.get("id"));
		System.out.println(prop.get("pass"));
		System.out.println(prop.get("name"));
		System.out.println(prop.get("email"));
		System.out.println(prop.get("phone"));
		
		// 6. 자원 반납
		bis.close();
		

	}

}
