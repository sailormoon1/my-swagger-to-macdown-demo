package com.example.myswaggertomacdowndemo;

import com.example.myswaggertomacdowndemo.config.ApplicationContextProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySwaggerToMacdownDemoApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MySwaggerToMacdownDemoApplication.class, args);
       Object controller =  ApplicationContextProvider.getBean("userManageController");
       Object serviceIml =  ApplicationContextProvider.getBean("userServiceImpl");
       System.out.println("controller实例为："+controller);
        System.out.println("controller实例为："+serviceIml);
    }

}
