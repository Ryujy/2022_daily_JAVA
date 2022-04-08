package chap02.ex02.two;

public class Two {

	public static void main(String[] args) {
		// 나머지 연산 (%)
		// 나머지 연산은 두 항을 나눈 나머지 값을 반환
		// 홀수 , 짝수 구분하거나 배수를 찾을 때 사용 된다.
		System.out.println("5%2 = " + 5%2);
		
		// 문자열 더하기
		String str = "JAVA";
		String str2 = "의 특징";
		System.out.println(str+str2); //문자 + 문자
		// 숫자와 문자 더하기
		str = "jdk" + 8.35;
		System.out.println(str);
		str = "jdk" + 8+0.35;
		System.out.println(str);  //앞에 문자열이 있으면 뒷 내용도 모두 문자로 본다.
		
		//숫자가 먼저 올 경우..
		str = 8+0.65 +"JDK";
		System.out.println(str); // 문자가 발견되기 전까지 숫자로 인식한다.
		//80.65JDK를 만들고 싶다면?
		str = 80 + 0.65 +"JDK";  //1
		System.out.println("1. "+str);
		str = "8" + "0.65" + "JDK";
		System.out.println("2. "+str); //2
		str = "" + 8 + 0.65 + "JDK";
		System.out.println("3. "+str); //3
		str="80.65"+"JDK";
		System.out.println("4. "+str); //4
		str=80+".65"+"JDK";
		System.out.println("5. "+str); //5
		str="8"+0.65+"JDK";
		System.out.println("6. "+str); //6

	}

}
