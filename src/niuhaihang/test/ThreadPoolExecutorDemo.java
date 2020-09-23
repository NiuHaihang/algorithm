package niuhaihang.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
	public static void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,500,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
		for(int i = 0; i < 100; i++) {
			threadPoolExecutor.execute(new MyThread());
			String info = String.format("线程池中线程数目:%s，队列中等待执行的任务数目:%s,已执行完的任务数目:%s .", threadPoolExecutor.getPoolSize(),threadPoolExecutor.getQueue().size(),threadPoolExecutor.getCompletedTaskCount());
			System.out.println(info);
		}
		threadPoolExecutor.shutdown();
	}
	static class MyThread implements Runnable{
		@Override
		public void run() {
			try {
				Thread.sleep(1);
				System.out.println(Thread.currentThread().getName()+"执行");
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}
	}
}
