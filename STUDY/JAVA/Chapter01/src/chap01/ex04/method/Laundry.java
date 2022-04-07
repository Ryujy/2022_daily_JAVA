package chap01.ex04.method;

public class Laundry {

	public static void main(String[] args) {
		
		String 빨래바구니 = "오늘 입은 옷";
		String 바구니 = 세탁기(빨래바구니);
		System.out.println(바구니);
		
	}
	
	//세탁기 : 메서드 명 
	//빨래감 : 문자열 형태의 매개 변수 (인자값, 파라미터)
    // String : 이 메서드를 실행하면 문자열 타입의 무언가가 밖으로 나온다.
	public static String  세탁기 (String 빨래감) {
		System.out.println(빨래감+"을 세탁");
		System.out.println(빨래감+"을 탈수");
		return "깨끗한 "+빨래감;
	}
	

}

