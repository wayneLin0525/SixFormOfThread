package SixFormOfThread.TimerThread;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//��ʱ��ÿ����ִ��һ������
public class TimerDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){

			@Override
			public void run() {
				System.out.println("Hello wayne");
			}
			
		}, new Date(),5000);
	}

}
