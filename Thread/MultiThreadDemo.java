package SixFormOfThread.Thread;

public class MultiThreadDemo extends Thread {

	@Override
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
	
	public MultiThreadDemo(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		MultiThreadDemo td1 = new MultiThreadDemo("t1");
		MultiThreadDemo td2 = new MultiThreadDemo("t2");
		MultiThreadDemo td3 = new MultiThreadDemo("t3");
		MultiThreadDemo td4 = new MultiThreadDemo("t4");
		
		td1.start();
		td2.start();
		td3.start();
		td4.start();
		
		while (true){
			System.out.println(Thread.currentThread().getName()+" is running");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}

}
