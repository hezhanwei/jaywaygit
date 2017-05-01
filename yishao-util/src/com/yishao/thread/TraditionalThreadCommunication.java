package com.yishao.thread;

/**
 * ��ϰ�� �������߳�ִ��10��ѭ�����������߳�ִ��100��ѭ�����������50�飻
 * 
 * 
 * @author yishao
 *
 */
public class TraditionalThreadCommunication {

	public static void main(String[] args) {

		final Bussiness bussiness = new Bussiness();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 50; i++) {
					bussiness.sub(i);
				}
			}
		}).start();

		for (int i = 1; i <= 50; i++) {
			bussiness.main(i);
		}

	}

}

class Bussiness {

	boolean flag = false;
	
	public synchronized void sub(int i) {
		while(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int j = 1; j <= 3; j++) {
			System.out.println("sub thread run.." + j + " loop of " + i);
		}
		flag = false;
		notifyAll();
	}

	public synchronized void main(int i) {
		
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int j = 1; j <= 3; j++) {
			System.out.println("main thread run.." + j + " loop of " + i);
		}
		flag = true;
		notifyAll();
	}

}
