package com.example.lab_1_sp.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
    private final Logger logger = LoggerFactory.getLogger(Logger.class);

    @Before("execution(* uvt.services.BookController.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Before: " + joinPoint);
    }

    @After("execution(* uvt.services.BookController.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("After: " + joinPoint);
}
}