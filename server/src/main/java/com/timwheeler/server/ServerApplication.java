package com.timwheeler.server;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }


    @Bean
    ApplicationRunner init(FinancialSnapshotRepository finacialSnapshot) {
        return (ApplicationRunner) finacialSnapshot;
    }



}

