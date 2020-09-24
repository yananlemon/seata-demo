package site.ilemon.business;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "site.ilemon.business",
exclude = {DataSourceAutoConfiguration.class})
@EnableDubbo(scanBasePackages = "site.ilemon.business")
public class BusinessExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessExampleApplication.class, args);
    }

}

