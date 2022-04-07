package chap01.ex03.casting;

public class Ex02 {

	public static void main(String[] args) {
		// 명시적 형변환 ( 큰 거 -> 작은 거, 동일크기 다른 형태)
		// eclipse에서 자동으로 해 준다.
		char charVal;
		int intVal;
		long longVal;
		float floatVal;
		double doubleVal;
		
		intVal = 44032;
		charVal =(char) intVal;  // int 인데 char에 들어갈거야 잘 확인해봐.
		System.out.println(charVal); //syso
		
		longVal = 500;  //longVal을 intVal에 넣어보자 -> *intVal이 왼쪽에 있어야 함!*
		intVal = (int) longVal;  
		
		doubleVal = 3.14;  //doubleVal을 floatVal에 넣어보자 
		floatVal = (float) doubleVal;
		
		
		
	}

}
