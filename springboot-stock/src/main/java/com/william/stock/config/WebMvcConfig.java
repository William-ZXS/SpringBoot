package com.william.stock.config;

import com.william.stock.common.TokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> patterns = new ArrayList<>();
        // 排除swagger文档系列路径
        patterns.add("/doc.html");
        patterns.add("/swagger-resources/**");
        patterns.add("/favicon.ico");
        patterns.add("/service-worker.js");
        patterns.add("/swagger-ui.html");
        patterns.add("/webjars/**");
        patterns.add("/error");
        patterns.add("/csrf");
        patterns.add("/actuator/**");
        patterns.add("/");
        patterns.add("/test/**");
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**").excludePathPatterns(patterns);
    }


    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("ExcelExport-");
        // 线程池最大数量
        executor.setMaxPoolSize(10);
        // 核心线程数量3
        executor.setCorePoolSize(3);
        // 空闲五分钟回收线程
        executor.setKeepAliveSeconds(300);
        executor.setQueueCapacity(50);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.afterPropertiesSet();
        return executor;
    }

}

