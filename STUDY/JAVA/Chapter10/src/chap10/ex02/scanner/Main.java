package chap10.ex02.scanner;

import java.util.Scanner;

import chap10.ex01.sysio.SysOutput;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력>"); // ln이 빠지면 줄바꿈 X
		String strResult = scan.nextLine();
		System.out.println(strResult);
		System.out.println();
		
		System.out.println("숫자 입력 >");
		int intResult = scan.nextInt();
		System.out.println(intResult);

		
	}

}
