package com.yishao.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<String>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CallableTest callableTest = new CallableTest();
		
		FutureTask<String> futureTask = new FutureTask<String>(callableTest);
		new Thread(futureTask).start();
		
		System.out.println(futureTask.get());
	}
	
	@Override
	public String call() throws Exception {
		System.out.println("what the fuck..");
		return "fuck";
	}

	
}
