package chap10.ex05.fileOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		// c:/img/001.png -> c:/img/temp/copy.png
		
		// 1. 읽어오고 저장할 파일 위치 지정
		String oriPath = "c:/img/image.jpg";              // 읽어올 파일
		String targetPath = "c:/img/temp/copy.jpg";   // 읽어온 파일을 저장할 위치
		
		// 2. 파일 객체 준비 + 스트림 준비(읽고 보낼..)
		FileInputStream fis = new FileInputStream(oriPath); // FileInputStream 에서는 File 객체를 굳이 쓰지 않아도 된다.  
		// 읽어올 때 필요한 스트림으로 위에서 정의한 인자를 썼다.
		FileOutputStream fos = new FileOutputStream(targetPath); // 내보낼 때 필요한 스트림. 
		// reader/writer stream 외에 다른 stream 들은 바이너리로 읽고 보낸다.
		
		// 3. 파일 읽어오기
		int data; // 읽어온 바이트들을 저장할 변수 정의
		int count = 0; // 반복문에서 사용될 변수로 파일 보내기의 진행상황을 시각적으로 알기위해 썼다.
		/*
		while((data = fis.read()) != -1) { // fis으로 읽어오는 것을 data라는 정수타입 변수에 저장하는데 data에 담기는 값이 -1이 아니라면 계속 반복해라.
															// -1은 EOF 를 뜻하고 EOF는 End Of File이란 뜻으로 파일의 끝. 즉, 파일에서 더이상 읽어올 것이 없다.
			fos.write(data); // 4. 파일 보내기   // 읽어온 값이 저장된 data를 fos로 내보낸다.
			count ++;								// count를 증가시켜 진행상황 표시
			System.out.println("복사중 : "+ count); // 진행상황을 시각적으로 보여주기 위한 출력문 
		}
		*/
		
		// 성능 향상
		byte[] arr = new byte[1024]; //1KB   성능 향상을 위해선 배열을 이용한다. 위에서 처럼 data를 이용하면 1byte 단위로 옮기는 것이고
		// 배열을 이용하면 지정한 byte까지 배열이 채워지길 기다렸다가 한번에 옮기기 때문에 더 빨라진다. 티스푼, 국자 차이
		
		while(fis.read(arr) != -1 ) {//읽어온 내용을 arr에 담는다. -1이 아니라면 계속 반복해라.
			fos.write(arr); // fos로 읽어온 배열을 내보낸다.
			count ++;     // 위에서의 count 역할과 동일
			System.out.println("복사중 : "+ count); // 진행상황을 보여주기 위한 출력문
		}
		// 반복문이 끝나면 파일을 읽어와서 내보내기가 완료된 것이므로 그것을 알려주는 출력문
		System.out.println("파일 복사 완료!!"); // jpg 85992 -> 84  / png 1836030 -> 1793 
		
		// 5. 사용한 자원 반납
		fos.flush(); //flush는 출력 스트림을 비우는 역할을 한다. 탈탈 털어줘야 가져오는 파일에서 빠지는 데이터가 없다.
		fis.close(); // 파일을 읽어올 때 사용한 스트림은 자동으로 닫히지 않기 때문에 close를 통해 닫아준다. (반납)
		fos.close();

	}

}
