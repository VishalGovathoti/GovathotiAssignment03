package question20;


class MyThread implements Runnable{
	public void run() {
		try {
			Thread.sleep(2500);
			System.out.println("t1 in run(), state: " + Thread.currentThread().getState());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}



