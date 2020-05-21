package com.alan.test;

import io.netty.util.internal.PlatformDependent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Component
public class Metrics {

    @PostConstruct
    public void init() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(()->{
            System.out.println("used direct memory: " + PlatformDependent.usedDirectMemory());
        }, 1, 1, TimeUnit.SECONDS);
    }
}
