package site.ilemon.seata.account;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "site.ilemon.seata.account")
@MapperScan({"site.ilemon.seata.account.mapper"})
@EnableDubbo(scanBasePackages = "site.ilemon.seata.account")
public class AccountExampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(AccountExampleApplication.class, args);
    }

}

