package com.example.demo.spring.patient;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.example.demo.services" })
public class ServiceConfig {
}
