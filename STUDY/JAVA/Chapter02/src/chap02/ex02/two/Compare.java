package chap02.ex02.two;

public class Compare {

	public static void main(String[] args) {
		// = 은 대입 연산자로 이미 사용했기 때문에 같다 라는 표현은 (==)을 사용한다.
		int v1 = 1;
		double v2 = 1.0;
		int v3 = 4;
		String v4 = "JAVA";
		String v5 = new String("JAVA");
		
		//비교 연산(조건에 대한 참 거짓을 반환)
		System.out.println(v1 == v2);
		System.out.println(v1 != v2);
		System.out.println(v1 < v3);
		System.out.println(v4 == v5);  // 문자열은 == 로 비교하지 말자
		System.out.println(v4.equals(v5));  // 문자열은 equals로 비교하자
		
		// && AND는 두 조건을 모두 만족해야 한다. 범위를 좁힐 때 사용
		// || OR 는 둘 중 하나만 만족해도 된다. 범위를 넓힐 때 사용
		int a = 6;
		
		if (a>1 && a<7) {
			System.out.println("a는 1보다 크고 7보다 작네요.");
		}
		
		if (a%2 == 0 || a%3 == 0) {
			System.out.println("a는 2의 배수이거나 3의 배수 이군요");
		}
		
		// 로그인
		// 입력한 아이디가 저장된 아이디와 일치 하는가?
		// 입력한 비밀번호가 저장된 비밀번호와 일치 하는가?
		String id = "admin";
		String pw = "pass";
		
		if(id.equals("admin")&&pw.equals("pass")) {
			System.out.println("로그인 완료!!");
		}
		
		
		
		

	}

}
