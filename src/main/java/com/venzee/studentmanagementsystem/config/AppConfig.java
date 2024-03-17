package com.venzee.studentmanagementsystem.config;

import com.venzee.studentmanagementsystem.models.ExamIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ExamIdGenerator examIdGenerator(){
        return new ExamIdGenerator();
    }
}
