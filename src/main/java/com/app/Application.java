package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/12/16.
 */
@SpringBootApplication
@ComponentScan("com.*")
@MapperScan("com.mapper")
public class Application {
    private  static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String []args){
        SpringApplication.run(Application.class,args);
        logger.info("web application starting");
    }
}
