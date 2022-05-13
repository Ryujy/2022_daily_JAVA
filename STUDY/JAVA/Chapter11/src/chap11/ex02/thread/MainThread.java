package chap11.ex02.thread;

public class MainThread {

	public static void main(String[] args) {

		/* 워크 스레드 */
		// 1. 할 일 객체 생성 <- 스레드 상속 클래스에 이미 넣어 놨다.
		// 2. 스레드 객체 생성 + 해야할 일 탑재 <- 그래서 클래스 생성만 해도 된다.
		Thread th = new Job();
		// 3. 스레드 스타트
		th.start();
		
		
		/* 메인 스레드 */
		for (int i = 0; i < 5; i++) {
			System.out.println("메인 스레드가 하는 일 : "+i);
			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) { 
				e.printStackTrace();
			} 
		}

	}

}
