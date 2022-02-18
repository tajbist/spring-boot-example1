package com.io.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Before(value = "execution(* com.io.service.CustomerService.*(..))")
    public void beforeAdvice(JoinPoint joinpoint){
        System.out.println("Before Method : "+joinpoint.getSignature());
        System.out.println("Creating Customer.");
    }

    @After(value = "execution(* com.io.service.CustomerService.*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        logger.info("{} returned with value {}", joinPoint);
    }

}
