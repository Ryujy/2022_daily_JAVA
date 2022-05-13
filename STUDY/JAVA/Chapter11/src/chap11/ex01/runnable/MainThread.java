package chap11.ex01.runnable;

public class MainThread {

	public static void main(String[] args) { // main thread
		
		/* 워크스레드 생성 후 실행 */
		// 1. 해야할 작업 만들기
		Runnable job = new Job(); // 다형성
		// 2. 스레드를 새로 생성하여 해야할 일 추가
		Thread work = new Thread(job);
		//3. 스레드 실행
		work.start();
		
		// 멀티 스레드 환경에서는 순서가 없다. - 그래서 매번 순서 바뀌기도..
		
		for (int i = 0; i < 5; i++) {
			System.out.println("메인스레드가 하는 일...");
			try {
				Thread.sleep(500); // 0.5초 쉬어라
			} catch (InterruptedException e) { // InterruptedException - 나중에 배움
				e.printStackTrace();
			} 
		}

	}

}
