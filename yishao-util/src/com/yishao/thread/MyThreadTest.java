package com.yishao.thread;

/**
 * notify wait notifyAll　　应该在同步方法或同步代码块中执行
 * 并且 必须使用 监视器锁的 notify wait 方法。
 * @author yishao
 *
 */
public class MyThreadTest implements Runnable {
	
	public static void main(String[] args) throws Exception{
		MyThreadTest myThreadTest = new MyThreadTest();
		MyThreadTest myThreadTest1 = new MyThreadTest();
		Thread t1 = new Thread(myThreadTest);
		Thread t2 = new Thread(myThreadTest1);
		t1.setName("甲");
		t2.setName("乙");
		t1.start();
		t2.start();
	}

	int t = 300;
	boolean flag = true;
	Object obj = null;
	@Override
	public void run() {
		
		while(flag){
			synchronized (this) {
				notify();
				if (t>0) {
					System.out.println(this.getClass().getName()+"---"+ Thread.currentThread().getName()+":"+t);
					t--;
				}else{
					flag = false;
				}
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
