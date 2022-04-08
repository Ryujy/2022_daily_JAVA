package chap02.ex03.three;

public class Three {

	public static void main(String[] args) {
		
		int score = 75;
		
		//score 의 값이 변함에 따라 grade의 값도 변하는 것
		// 조건 > 맞으면 이거 : 아니면 이거;
//		char grade = score>90? 'A':'B';
//		System.out.println(grade);

		//만약 score가 90보다 클 경우 A, 80보다 클 경우 B, 아니면 C
		char grade = score>90?'A':(score>80?'B':'C');
		System.out.println(grade);
		
	}

}
