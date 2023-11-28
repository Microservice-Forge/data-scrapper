package com.payam.taheri.cryptobot.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sample {

    @Scheduled(cron = "0/5 * * * * ?")
    public void everyFiveSeconds() {
        System.out.println("Periodic task: " + new Date());
    }

}