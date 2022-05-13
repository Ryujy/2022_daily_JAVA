package chap10.ex13.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExam {

	public static void main(String[] args) {
		// 경로 특성 클래스
		Path path = Paths.get("c:/img/temp/002.png"); // get은 static method
		// Paths로 할 수 있는 것들..
		System.out.println("특정 경로의 파일 이름 : "+path.getFileName());
		System.out.println("부모 폴더 : "+path.getParent().getFileName());
		System.out.println("루트 : "+path.getRoot());
		System.out.println("경로 단계 : "+path.getNameCount());
		
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(i + "단계 : " + path.getName(i));
		}

	}

}
