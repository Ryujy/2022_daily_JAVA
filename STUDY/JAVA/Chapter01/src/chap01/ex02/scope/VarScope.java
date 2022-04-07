package chap01.ex02.scope;

public class VarScope {
	
	String str = "아무거나 입력 하세요."; //클래스 영역에서 생성되었기 때문에 method에서 사용할 수 있다.
	
	public static void main(String[]args) {
		int number = 123; //method에서 생성되었기 때문에 method 밖으로 못나간다.
		
		for (int i = 0; i < args.length; i++) {
			int sum = 0; //for문 안에서 만들어졌기 때문에 for 밖으로 나갈 수 없다.
			sum = i + number; //number는 for문 안에서 사용 가능
		}
		
		str = sum + "입니다."; //sum은 for문을 벗어날 수 없다.
	}

}
