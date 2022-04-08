package chap02.ex02.two;

public class Subs {

	public static void main(String[] args) {
		//대입 : 특정 변수에 특정 값을 넣는 것
		int result = 0;
		result = result + 10;
		System.out.println(result);
		
		result += 10;  //result에 10을 더해 result 안에 넣겠다.
		System.out.println(result);
		
		//응용
		String str = "대입 연산자는 ";
		str += "합한 값을 그대로 두고 ";
		str += "그 뒤에 누적시킬 때 ";
		str += "아주 유용하다.";
		System.out.println(str);
		
		//1~5 까지 합한 값을 구하시오
		int num =1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		System.out.println(num);

	}

}
