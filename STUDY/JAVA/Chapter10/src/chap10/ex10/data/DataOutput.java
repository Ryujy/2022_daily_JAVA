package chap10.ex10.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {

	public static void main(String[] args) throws IOException {
		// 쓰기만..
		
		//  1. 파일 위치 지정
		String path = "c:/img/temp/data.dat"; // 그냥 읽을 수 없다.(보안성)
		
		// 2. 스트림 준비 (주+보조)
		FileOutputStream fos = new FileOutputStream(path);
		// 내보내는 속도 향상
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 자바 고유 데이터 타입을 저장하므로 보조스트림 사용
		DataOutputStream dos = new DataOutputStream(bos);

		
		// 3. 쓰기 (최종적으로 사용하는 메서드의 보조스트림이 가장 나중에 탑승 되어야 한다.)
		dos.writeUTF("류지윤"); // string
		dos.writeInt(500); // int
		dos.writeBoolean(true);  //boolean
		
		// 4. 자원 반납 (flush, close)
		dos.flush();
		dos.close();

	}

}
