package chap10.ex03.file;

import java.io.File;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("c:/img/temp"); // 파일 객체 생성
		// 폴더 생성
		System.out.println("해당 폴더가 존재 하는가? : "+dir.exists());
		if (dir.exists()==false) {
			System.out.println("폴더 생성 여부 : "+dir.mkdirs()); // 폴더 생성
		}
		
		// 파일 생성
		File file = new File("c:/img/temp/test.txt");
		if(file.exists()==false) {
			System.out.println("파일 생성 여부 : "+file.createNewFile());
		}
		// test폴더가 존재 -> 파일 생성이 안됐었음! 지우고 했더니 됨
		
		// 폴더의 정보 알아보기
		dir = new File("c://STUDY/JAVA");
		// 파일명 뽑아 내기(파일인지/폴더인지 구분이 어렵다.)
		String[] fileNames = dir.list();
		for(String name : fileNames) {
			System.out.println(name);
		}
		System.out.println("================");
		
		//상세정보 추출
		for (File f : dir.listFiles()) {
			String info = "";
			if(f.isDirectory()) {
				info += "[디렉토리]";
			} else {
				info += "[파일]";
			}
			info += f.getName()+" / " + f.length()+"byte";
			System.out.println(info);
		}
		

	}

}
