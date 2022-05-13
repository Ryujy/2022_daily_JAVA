package chap11.ex01.runnable;

// 스레드를 만드는 방법 1. Runnable 인터페이스 구현
public class Job implements Runnable {

	@Override
	public void run() { // 스레드가 해야할 일
		
		for (int i = 0; i < 5; i++) {
			System.out.println("워크스레드가 하는 일...");
			try {
				Thread.sleep(500); // 0.5초 쉬어라
			} catch (InterruptedException e) { // InterruptedException - 나중에 배움
				e.printStackTrace();
			} 
		}
	}

}
