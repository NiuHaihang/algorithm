package niuhaihang.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerTest {
	private static BlockingQueue<String> bq = new ArrayBlockingQueue<>(5);
	private static class Producer extends Thread{
		@Override
		public void run() {
			try {
				bq.put("product");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("produce..");
		}
	}
	private static class Consumer extends Thread{
		@Override
		public void run() {
			try {
				String product = bq.take();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("consume..");
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
	        Producer producer = new Producer();
	        producer.start();
	    }
	    for (int i = 0; i < 5; i++) {
	        Consumer consumer = new Consumer();
	        consumer.start();
	    }
	    for (int i = 0; i < 3; i++) {
	        Producer producer = new Producer();
	        producer.start();
	    }
	}
}
