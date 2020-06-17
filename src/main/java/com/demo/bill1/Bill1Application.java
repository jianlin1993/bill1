package com.demo.bill1;

//import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
//@EnableTransactionManagement
@MapperScans({@MapperScan("com.demo.bill1.mapper")})
//@EnableDubboConfiguration
public class Bill1Application {

    public static void main(String[] args) {
        SpringApplication springApplication =new SpringApplication(Bill1Application.class);
        /** 设置横幅模式(设置关闭)  关闭打印的spring字样*/
        springApplication.setBannerMode(Banner.Mode.OFF);
        /** 运行 */
        try {
            springApplication.run(args);
        }catch(Exception e){
            e.getMessage();
        }
        System.out.println("启动成功！");
    }

}

