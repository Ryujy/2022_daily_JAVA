package chap10.ex11.obj;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class ObjectInput {

	public static void main(String[] args) throws IOException, Exception {
		// 1. 읽어올 파일 위치 지정
		String path = "c:/img/temp/obj.dat";
		// 2. 스트림 준비 (주 + 보조)
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		// 3. 읽어오기 (순서를 맞춰 줄 것!)
		
		// 3-1. 기본 형태
		String msg = ois.readUTF();
		// 3-2. array 형태
		int[] scores = (int[])ois.readObject(); // array
		// 3-3. 컬렉션 프레임워크
		HashMap<String, String> map = (HashMap<String, String>) ois.readObject(); //map
		// 3-4  객체형태
		Sample sample = (Sample) ois.readObject(); //class
		
		System.out.println(msg);
		System.out.println(scores[0]);
		System.out.println(map.get("name")+ " : " + map.get("phone"));
		System.out.println(sample.num + "/" + sample.team + "/" + sample.job);
		System.out.println(sample.method());
		
		// 자원 반납
		ois.close();

	}

}
