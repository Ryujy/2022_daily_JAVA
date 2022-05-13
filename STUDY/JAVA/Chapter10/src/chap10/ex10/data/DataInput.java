package chap10.ex10.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInput {

	public static void main(String[] args) throws IOException {
		
		// 읽기만..
		
		// 1. 파일위치지정
		String path = "c:/img/temp/data.dat";
		
		// 2. 스트림준비 (주 + 보조)
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		// 3. 읽어오기 (쓰기의 순서대로 읽어야만 한다.) - 단점 따라서 api(규격)이 필요한겨..순서알아야하자나
		// class 객체 형태는 보낼 수 없다. 
		String name = dis.readUTF();
		int num = dis.readInt();
		boolean yn = dis.readBoolean();
		System.out.println("이름 : "+name);
		System.out.println("급여 : "+num);
		System.out.println("승진 대상 여부 : "+yn);
		
		// 4. 자원 반납
		dis.close();
		
	}

}
