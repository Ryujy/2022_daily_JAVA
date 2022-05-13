package chap10.ex11.obj;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ObjOuput {

	public static void main(String[] args) throws IOException {
		// 1. 내보낼 파일 위치 지정
		String path = "c:/img/temp/obj.dat";
		
		// 2. 스트림 준비 (주+보조)
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		// 3. 쓰기
		oos.writeUTF("기본 데이터 형태"); // 3-1. 기본 형태
		
		oos.writeObject(new int[] {90,95,100}); // 3-2. array 형태
		
		HashMap<String, String> map = new HashMap<String,String>();// 3-3. 컬렉션 프레임워크
		map.put("name", "kim");
		map.put("phone" , "01012341234");
		oos.writeObject(map);
		
		oos.writeObject(new Sample()); //3-4  객체형태

		// 4. 자원반납
		oos.flush();
		oos.close();
	}

}
