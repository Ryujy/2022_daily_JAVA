package chap10.ex11.obj;

import java.io.Serializable;

// 직렬화(Serialiae) - 객체 덩어리를 통신선으로 보내기 위해 잘게 쪼개는 작업
// 역직렬화(UnSerialize) - 쪼개진 내용을 객체 덩어리로 다시 합치는 작업
// 이때 합치기 위한 표준(규격)이 필요하다. (쪼갠대로 합쳐야하니까)그래서  Serializable 인터페이스가 필요
public class Sample implements Serializable {
	
	private static final long serialVersionUID = 1L; //직렬화 역직렬화시 사용되는 고유번호 (없어도 무방)
	
	int num = 11;
	String team = "edu";
	String job = "manager";
	
	public String method() {
		return "method call";
	}
}
