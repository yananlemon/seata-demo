package site.ilemon.seata.storage;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "site.ilemon.seata.storage")
@MapperScan({"site.ilemon.seata.storage.mapper"})
@EnableDubbo(scanBasePackages = "site.ilemon.seata.storage")
public class StorageExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageExampleApplication.class, args);
    }

}

