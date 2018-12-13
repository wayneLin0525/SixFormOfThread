package SixFormOfThread.ReturnValueThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//带返回值的线程实现方式
/*
 *1. 创建一个类实现Callable接口，实现call方法。这个接口类似于Runnable接口，但比Runnable接口更加强大，增加了异常和返回值。
2. 创建一个FutureTask，指定Callable对象，做为线程任务。
3. 创建线程，指定线程任务。
4. 启动线程 */

public class CallableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		Callable<Integer> call = new Callable<Integer>(){

			public Integer call() throws Exception {
				System.out.println("thread start...");
				Thread.sleep(1000);
				return 1;
			}
			
		};
		
		FutureTask<Integer> task = new FutureTask<Integer>(call);
		Thread t = new Thread(task);
		
		t.start();
		System.out.println("do other thing ");
		//通过FutureTask的get()方法拿到线程的返回值
		System.out.println("拿到线程的执行结果："+task.get());

	}

}
