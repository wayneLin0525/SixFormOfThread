package SixFormOfThread.Runnable;

public class ThreadTarget implements Runnable {
	public interface Runnable{
		public abstract void run();
	}
	
	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName()+" is running");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		ThreadTarget tt = new ThreadTarget();
		Thread t = new Thread();
		t.start();
		
		while(true){
			System.out.println(Thread.currentThread().getName()+" is running");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}

	

}
