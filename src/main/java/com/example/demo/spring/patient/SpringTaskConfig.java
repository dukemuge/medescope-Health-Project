package com.example.demo.spring.patient;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan({ "com.example.demo.task" })
public class SpringTaskConfig {

}
