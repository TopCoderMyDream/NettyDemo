package com.demo2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TimeServerHandlerExecutePool {
	
	private ExecutorService executor;
	public TimeServerHandlerExecutePool(int maxPollSize,int queueSize) {
		executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), maxPollSize, 120L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(queueSize));
	}
	
	public void execute(Runnable task) {
		executor.execute(task);
	}
}
