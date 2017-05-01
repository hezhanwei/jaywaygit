package com.yishao.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(); 
		Future<String> submit = null;
		for(int i=0; i<10;i++){
			final int task = i;
			long s = System.currentTimeMillis();
			submit = newCachedThreadPool.submit(
				
					new Callable<String>() {
						@Override
						public String call() throws Exception {
							
							Thread.sleep(1000);
							System.out.println(Thread.currentThread().getName()+"总耗时：" +( System.currentTimeMillis() - s));
							return "task"+task;
						}
					}
		);
//			
//			System.out.println(Thread.currentThread().getName()+"返回结果："+submit.get());
		}
		
		System.out.println("等待线程执行完成。。");
		
		
		
		System.out.println("hahhahahhahh");
	}
}
