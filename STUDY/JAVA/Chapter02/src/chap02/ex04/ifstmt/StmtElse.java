package chap02.ex04.ifstmt;

public class StmtElse {

	public static void main(String[] args) {
		
		// if문은 각각의 케이스를 지정해준다.
		// 때문에 if문과 if문 사이에 틈이 발생할 수 있다.
		System.out.println("두부 가게에 간다.");
		int box = 0;
		
		if(box>0) {//두부가 있을 경우
			System.out.println("두부를 산다.");
		}
		
		if(box<1) {//두부가 없을 경우 (조건을 만약 box < 0 으로 하면 실행이 되지 않을 수 있다.)
			System.out.println("순두부를 산다.");
		}
		
		System.out.println("집에 온다.");
		
		
		// if else문은 if가 아닌 경우 무조건 else가 된다.
		if(box>0) {//두부가 있을 경우
			System.out.println("두부를 산다.");
		} else {// 그 외에는 무조건..
			System.out.println("순두부를 산다.");
		}

	}

}
