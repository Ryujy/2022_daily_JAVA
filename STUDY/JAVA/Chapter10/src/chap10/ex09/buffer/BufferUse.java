package chap10.ex09.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferUse {

	public static void main(String[] args) throws IOException {
		
		TimeChecker chk = new TimeChecker(); // 버퍼사용했을 때의 시간 측정을 위해 TimeChecker 클래스 객체화
		// c:/img/001.png -> c:/img/temp/copy.png
		
		// 1. 가져올 파일과 내보낼 파일 위치 지정
		// 2. 스트림 준비
		FileInputStream fis = new FileInputStream("c:/img/001.png"); //가져올 파일의 위치를 지정하고 읽어올 때 필요한 스트림을 fis라는 이름으로 준비
		FileOutputStream fos = new FileOutputStream("c:/img/temp/copy.png"); // 가져온 파일을 내보낼 위치를 지정하고 그 때 필요한 스트림 준비
		
		// 보조스트림준비 - 파일 읽고 내보내는 속도를 향상시키기 위해 버퍼스트림을 보조스트림으로 추가 - 버퍼는 전송받은 데이터를 모아서 한꺼번에 전송해줌
		BufferedInputStream bis = new BufferedInputStream(fis); // 버퍼스트림 bis 생성하고 위에서 정의한 fis를 넣어 사용
		BufferedOutputStream bos = new BufferedOutputStream(fos); // 마찬가지로 내보내는 버퍼 보조스트림 bos에 fos를 넣는다.
		
		// 3. 읽어오기 (배열)
		chk.timeStart(); // 시간측정시작 - 위에서 객체화한 TimeChecker 클래스의 메서드 사용 
		byte[] arr = new byte[1024]; // 배열로 데이터를 옮기기 위해 배열 정의
		while (bis.read(arr) != -1) { // 읽어온 내용을 배열에 담는데 배열이 -1을 반환하면 더이상 담을 데이터가 없는 것이므로 -1을 반환하지 않는 동안 반복하라는 조건
			bos.write(arr);  // 4. 내보내기 - 배열에 담은 데이터를 bos에 담는다.
		}
		System.out.println("버퍼사용 : "+chk.timeStop()+"ms"); // 3ms - 시간측정완료
		// 5. 자원 반납 - 마지막으로 사용해준 스트림만 반납해주면 된다.
		bos.flush(); // 출력 스트림을 사용하면 flush를 통해서 남아있는 데이터가 있다면 비워준다.
		bis.close(); // 입력 스트림 반납
		bos.close(); // 출력 스트림 반납

	}

}
