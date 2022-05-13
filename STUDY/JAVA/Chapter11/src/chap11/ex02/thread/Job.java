package chap11.ex02.thread;

// 스레드 생성 방식 2 : 스레드 상속
public class Job extends Thread {

	// 이 경우 run 메서드는 수동으로 오버라이드 해줘야 한다.
	
	@Override
	public void run() { // 스레드가 해야할 일

		for (int i = 0; i < 5; i++) {
			System.out.println("워크 스레드가 하는 일 : "+i);
			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) { 
				e.printStackTrace();
			} 
		}
		
	}

	
	
	
	
	
}
