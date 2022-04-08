package chap02.ex01.one;

public class One {

	public static void main(String[] args) {

		/* 증감 연산자 */
		int x = 10;  // 선언 : x 라는 변수를 만들어
		int y = 10;
		
		x++;  //증가가 나중에
		++y;  //증가가 먼저
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
		x = 1; //호출 : x를 가져와서 1을 넣어
		y = 1;
		
		int result = (++x)+10;
		int result2 = (y++) + 10;
		
		//즉 ++가 뒤에 붙는 다는 것은 무언가 행해지고 증가한다는 뜻이다. (카운트 셀 때 주로 사용 예: 운동 할 때 들고나서 숫자 세듯이)
		System.out.println("result : "+ result); // x가 증가해서 2가 되고 그 2를 10과 더해서 12가 됨
		System.out.println("result2 : "+ result); //y와 10을 더해 11이 되고 나중에 y가 증가하여 2가 된다.
		

		
		/* 논리부정 연산자 */
		boolean yn = true;
		yn = !yn; //false
		System.out.println("!YN : "+yn);
		yn = !yn; //true
		System.out.println("!YN : "+yn);
		
		
	}

}
