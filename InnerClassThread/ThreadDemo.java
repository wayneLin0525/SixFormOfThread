package SixFormOfThread.InnerClassThread;

public class ThreadDemo {

	
	public static void main(String[] args) {
		
		//基于子类的实现
		new Thread(){
			public void run(){
				while(true){
					System.out.println(Thread.currentThread().getName()+" is running");
					try{
						Thread.sleep(1000);
						
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			};
		}.start();
			
		
		//基于接口的实现
		new Thread(new Runnable(){
			public void run(){
				while(true){
					System.out.println(Thread.currentThread().getName()+" is running");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		while(true){
			System.out.println(Thread.currentThread().getName()+" is running");
			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
