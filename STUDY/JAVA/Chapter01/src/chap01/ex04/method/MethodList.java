package chap01.ex04.method;

public class MethodList {

	public static void main(String[] args) {
		

	}
	
	//반환 타입 O, 매개 변수 O
	String 토스트기(String 빵) {
		return "구운 빵";
	}
	
	//반환 타입 O, 매개 변수 X
	String 번호표기계() {
		return "번호표";
	}
	
	//반환 타입 X, 매개 변수 O
	void 저금통(int 동전) {
		System.out.println(동전+"저금");
	}
	
	//반환 타입 X, 매개 변수 X
	void 호출벨() {
		System.out.println("호출");
	}
	
	//사례 찾을 때 정의내리기 - 매개변수 : 물리적 물체 , 반환 : 물리적 물체
	//1. 커피머신, 손건조기
	//2. 손소독제자동분사기
	//3. 텀블러, 필통, 카드 단말기? , 쓰레기통
	//4. 버스하차벨, 엘레베이터 버튼
	
	// 1. 매개변수 O, 반환 타입 O
	String 커피머신(String 커피캡슐) {
		return "커피";
	}
	// 2. 매개변수 X, 반환 타입O
	String 손소독제자동분사기() {
		return "소독제";
	}
	// 3. 매개변수 O, 반환 타입 X
	void 텀블러(커피) {
		System.out.println(커ㅓ피);
	}
	// 4. 매개변수 X, 반환 타입 X
	void 버스하차벨() {
		System.out.println("누름");
	}
	
	
	
	
	
	
	
	
}
	