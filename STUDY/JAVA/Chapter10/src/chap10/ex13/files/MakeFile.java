package chap10.ex13.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MakeFile {

	public static void main(String[] args) throws IOException {
		
		// 디렉토리 생성
		Path dir = Paths.get("c:/Temp/test");
		System.out.println("존재하나? "+Files.exists(dir));
		System.out.println("존재하지 않나? "+Files.notExists(dir));
		if(Files.notExists(dir)) {
			Files.createDirectories(dir);
			
		}
		
		
		// 파일 생성
		Path file = Paths.get("c:/Temp/test/textFile.txt");
		if(Files.notExists(file)) {
			Files.createFile(file);
		}

	}

}
