package chap10.ex12.prop;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropWrite {

	public static void main(String[] args) throws IOException {
		// 1. 파일 위치 지정
		String path = "src/chap10/ex12/prop/profile.properties"; // 확장자 properties
		
		// 2. 주스트림 + 보조스트림 준비
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 3. Properties 객체 준비
		Properties prop = new Properties();
		
		// 4. 객체에 데이터 추가
		prop.put("id", "admin");
		prop.put("pass", "1234");
		prop.put("name", "류지윤");
		prop.put("email", "admin@naver.com");
		prop.put("phone", "010-1234-1234");
		
		// 5. 내보내기
		prop.store(bos, "this is simple profile"); // 저장스트림, 주석 내용(store를 사용하면 flush가 필요 없다.)
		
		// 6. 자원 반납
		bos.close();
	}

}
