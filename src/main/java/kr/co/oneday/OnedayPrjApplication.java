package kr.co.oneday;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan({
    "kr.co.oneday.classDetail",
    "kr.co.oneday.map",
    "kr.co.oneday.payment"
})
public class OnedayPrjApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OnedayPrjApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(OnedayPrjApplication.class, args);
    }
}
