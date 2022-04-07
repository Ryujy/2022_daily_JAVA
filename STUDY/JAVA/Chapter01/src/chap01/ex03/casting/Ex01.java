package chap01.ex03.casting;

public class Ex01 {

	public static void main(String[] args) {
		
		//묵시적 형변환 : 작은 거 -> 큰 거로 들어갈 때.
		// 굳이 체크 안한다. 그래서 묵시적이라고 함.
		byte byteVal;
		char chVal;
		int intVal;
		long longVal;
		float floatVal;
		double doubleVal;

		//byte < int
		byteVal = 10;
		intVal = byteVal; //byte보다 int가 크므로 그냥 들어간다.
		
		//char < int;
		chVal = 'A';
		intVal = chVal;
		System.out.println(intVal); //65 == A (아스키코드)
		
		// int < long
		intVal=100;
		longVal = intVal;
		
		// float < double
		floatVal = 0.01f;
		doubleVal = floatVal;
		
		
	}

}
