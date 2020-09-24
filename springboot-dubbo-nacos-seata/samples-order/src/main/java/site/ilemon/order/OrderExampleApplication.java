package site.ilemon.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "site.ilemon.order")
@MapperScan({"site.ilemon.order.mapper"})
@EnableDubbo(scanBasePackages = "site.ilemon.order")
public class OrderExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderExampleApplication.class, args);
    }

}

