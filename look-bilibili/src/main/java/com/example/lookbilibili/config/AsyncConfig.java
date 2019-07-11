package com.example.lookbilibili.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {
	// 定义线程池
	@Override
	public Executor getAsyncExecutor() {
		// 定义线程池
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		// 核心线程数
		taskExecutor.setCorePoolSize(8);
		// 线程池最大线程数
		taskExecutor.setMaxPoolSize(30);
		// 线程队列最大线程数
		taskExecutor.setQueueCapacity(200);
		// 初始化
		taskExecutor.initialize();
		return taskExecutor;
	}
}
