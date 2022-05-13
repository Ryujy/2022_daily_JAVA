package chap10.ex13.files;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class FsExam {

	public static void main(String[] args) throws IOException {
		// 파일 시스템(저장 장소 - 드라이브)
		// 저장소에 대한 기본 정보를 가져온다.
		FileSystem fs = FileSystems.getDefault();
		
		Iterable<FileStore> list =  fs.getFileStores(); // Iteratorble - set으로 가져온단 뜼
		
		for (FileStore info : list) {
			System.out.println("드라이브 이름 : " + info.name());
			System.out.println("포맷(NTFS/FAT32) : " + info.type());
			System.out.println("전체공간 : " + info.getTotalSpace()/(1024*1024*1024)+"GB"); //byte
			System.out.println("사용 가능 공간 : " + info.getUsableSpace()/(1024*1024*1024)+"GB"); //byte
			System.out.println("=====================");
		}

	}

}
