package com.yishao.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {

	public static void main(String[] args) {
		
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		Ticket ticket = new Ticket();
		for(int i = 0;i<5;i++){
			newFixedThreadPool.execute(new Ticket());
		}
//		
//		Thread t1 = new Thread(ticket);
//		Thread t2 = new Thread(ticket);
//		t1.setName("¼×");
//		t2.setName("ÒÒ");
//		t1.start();
//		t2.start();
	}
}
	class Ticket implements Runnable {

		int num = 1;

		@Override
		public void run() {
			try {
				while(true){
					getTicket();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public synchronized void getTicket() throws InterruptedException {
			
//				notify();
				if (num<150) {
					Thread.sleep(200);
					System.out.println(Thread.currentThread().getName()+"--´òÓ¡µÚ"+num+"ÕÅÆ±");
					num++;
//					wait();
				}
		}

	}
