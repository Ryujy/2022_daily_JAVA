package chap11.ex01.runnable;

public class Anonymain {

	public static void main(String[] args) {

		// 1. 해야할 작업 만들기
		
		// 2. 워크스레드 생성
		Thread work = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 5; i++) {
					System.out.println("워크스레드가 하는 일...");
					try {
						Thread.sleep(500); // 0.5초 쉬어라
					} catch (InterruptedException e) { // InterruptedException - 나중에 배움
						e.printStackTrace();
					} 
				}
				
			}
		});
		//3. 스레드 실행
		work.start();
		
		//
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
