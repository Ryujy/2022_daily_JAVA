package chap02.ex04.ifstmt;

import java.util.Scanner;

public class StmtElseif {

	public static void main(String[] args) {
		// 자판기에서 음료를 선택하면 해당 음료가 나오도록
		//콜라, 생수, 오렌지주스, 사이다, 에너지음료, 이온음료, 냉커피, 식혜
		System.out.println("음료를 선택하세요.");
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		//System.out.println("당신이 선택한 음료: "+item);
		
		if(item.equals("콜라")) {
			System.out.println("콜라가 나왔습니다.");
		}
		//나머지도 if 문으로 구현 해보자 ( 이렇게 했을 경우 발생할 문제점 생각해보기)
		if(item.equals("생수")) {
			System.out.println("생수가 나왔습니다.");
		} else if(item.equals("오렌지주스")) {
			System.out.println("오렌지주스가 나왔습니다.");
		} else if(item.equals("사이다")) {
			System.out.println("사이다가 나왔습니다.");
		} else if(item.equals("에너지음료")) {
			System.out.println("에너지음료가 나왔습니다.");
		} else if(item.equals("이온음료")) {
			System.out.println("이온음료가 나왔습니다.");
		} else if(item.equals("냉커피")) {
			System.out.println("냉커피가 나왔습니다.");
		} else if(item.equals("식혜")) {
			System.out.println("식혜가 나왔습니다.");
		} else {//위의 if 어디에도 소속되지 않았다면??
			System.out.println("올바른 음료를 선택해 주세요!!!");
		}
		// if만 사용할 경우 선택지에 없는 음료를 선택했을 때 동작할 수 없다.
		
		
		// if와 else if의 차이점? 
		// if만 사용할 경우 생기는 빈틈을 else로 커버 가능
		// 벤다이어그램 그림 참고
	}

}
