package chap10.ex01.sysio;

import java.io.IOException;
import java.io.OutputStream;

public class SysOutput {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		//SysOutput.main(args);System.out.println();
		
		// 97 ~ 122 까지 출력
		for(int i = 97; i<= 122; i++) {
			os.write(i);
		}
		os.write(13); // 13 == enter
		os.flush(); // output을 할 때 flush는 필수다
		os.close();

	}

}
