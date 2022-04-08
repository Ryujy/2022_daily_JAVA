package chap02.ex04.ifstmt;

public class Stmtif {

	public static void main(String[] args) {
		// if문은 ()안의 조건이 만족되면 {} 안의 내용이 실행 된다.
	if(true) {
		System.out.println("무조건 실행");
	}
	
	// 두부 사오는 로직
	int tofuBox = 1; // 두부 박스
	System.out.println("두부 가게에 간다.");
	if(tofuBox>0 ) {//두부 박스에 두부가 0개 이상이면
		System.out.println("두부를 산다.");
	}
	System.out.println("집에 돌아온다.");
	
	

	}

}
