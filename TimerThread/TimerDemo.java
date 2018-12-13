package SixFormOfThread.TimerThread;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

//定时器
public class TimerDemo {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss" );
	
	public static void main(String[] args) throws Exception {
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){

			@Override
			public void run() {
				System.out.println("定时任务开始执行.");
			}
			
		},format.parse("2018-12-13 16:02:00"));
		
		
		
	}

}
