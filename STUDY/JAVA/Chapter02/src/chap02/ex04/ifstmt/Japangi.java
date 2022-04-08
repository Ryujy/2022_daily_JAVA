package chap02.ex04.ifstmt;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {
		// //콜라, 생수, 오렌지주스, 사이다, 에너지음료, 이온음료, 냉커피, 식혜
		System.out.println("돈을 넣으세요");
		Scanner scan2 = new Scanner(System.in);
		int money = scan2.nextInt();
		
		System.out.println("음료를 선택 하세요.");
		Scanner scan1 = new Scanner(System.in);
		String item = scan1.nextLine();
		
		//System.out.println(item+" / "+money);
		
		//item 과 money를 모두 만족해야 음료수가 나온다.
		if (money>=2000 && item.equals("콜라")) {
			System.out.println(item + "가 나왔습니다.");
			System.out.println("거스름돈은 "+ (money-2000) +"원 입니다." );
		} else if (money >= 1500 && item.equals("에너지음료")) {
			System.out.println(item + "가 나왔습니다.");
			System.out.println("거스름돈은 "+ (money-1500) +"원 입니다." );
		} else if (money >= 1000 && (item.equals("오렌지주스") || item.equals("사이다") 
				|| item.equals("이온음료") || item.equals("냉커피") || item.equals("식혜"))) {
			System.out.println(item + "가 나왔습니다.");
			System.out.println("거스름돈은 "+ (money-1000) +"원 입니다." );
		} else if (money >= 500 && item.equals("생수")) {
			System.out.println(item + "가 나왔습니다.");
			System.out.println("거스름돈은 "+ (money-500) +"원 입니다." );
		} else {
			System.out.println("올바른 음료와 금액을 입력해주세요.");
		}
	}
	
	
	
// 음료 자판기 파이썬으로는 음료 여러가지 선택도 하고 더 다양하게 구현할 수 있을 것 같은데 복습할 때 해보는게 어때?
}
