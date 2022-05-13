package chap11.ex02.thread;

public class AnonyMain {

	public static void main(String[] args) {
		
		/* 워크 스레드 - 익명객체 */
		Thread th = new Thread() {

			@Override
			public void run() {
				
				for (int i = 0; i < 5; i++) {
					System.out.println("워크 스레드가 하는 일 : "+i);
					try {
						Thread.sleep(500); 
					} catch (InterruptedException e) { 
						e.printStackTrace();
					} 
				}
				
			}
		};
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
