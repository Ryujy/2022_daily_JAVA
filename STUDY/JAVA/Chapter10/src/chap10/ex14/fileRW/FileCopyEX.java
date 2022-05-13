package chap10.ex14.fileRW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyEX {

	public static void main(String[] args) throws IOException {
		
		// 1. 읽어오고 저장할 파일 위치 지정
		Path from = Paths.get("c:/img/001.png");
		Path to = Paths.get("c:/img/temp/copy.jpg");
		
		// 2. 파일 읽어오기 + 3. 파일쓰기 = COPY
		Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);
		//REPLACE_EXISTING : 이미 있는 파일이면 덮어쓴다. (이 옵션이 없으면 exception 발생)
		//COPY_ATTRIBUTES :파일의 속성까지도 함께 복사 (권한, 읽기 전용 등등)
		
		System.out.println("파일 복사 완료");

	}

}
