package SixFormOfThread.ReturnValueThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//������ֵ���߳�ʵ�ַ�ʽ
/*
 *1. ����һ����ʵ��Callable�ӿڣ�ʵ��call����������ӿ�������Runnable�ӿڣ�����Runnable�ӿڸ���ǿ���������쳣�ͷ���ֵ��
2. ����һ��FutureTask��ָ��Callable������Ϊ�߳�����
3. �����̣߳�ָ���߳�����
4. �����߳� */

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
		//ͨ��FutureTask��get()�����õ��̵߳ķ���ֵ
		System.out.println("�õ��̵߳�ִ�н����"+task.get());

	}

}
