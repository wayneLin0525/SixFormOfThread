package SixFormOfThread.BaseOnThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//创建线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		
		while(true){
			threadPool.execute(new Runnable(){

				public void run() {
					System.out.println(Thread.currentThread().getName()+" is running");
					try{
						Thread.sleep(3000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
				
			});
		}

	}

}
