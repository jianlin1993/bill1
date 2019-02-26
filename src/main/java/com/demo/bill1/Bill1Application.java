package com.demo.bill1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bill1Application {

    public static void main(String[] args) {
        SpringApplication springApplication =new SpringApplication(Bill1Application.class);
        /** 设置横幅模式(设置关闭)  关闭打印的spring字样*/
        springApplication.setBannerMode(Banner.Mode.OFF);
        /** 运行 */
        springApplication.run(args);
    }

}

