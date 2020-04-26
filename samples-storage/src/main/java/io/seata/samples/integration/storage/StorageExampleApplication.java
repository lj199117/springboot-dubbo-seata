package io.seata.samples.integration.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication(scanBasePackages = "io.seata.samples.integration.storage")
//@EnableDiscoveryClient
@MapperScan({"io.seata.samples.integration.storage.mapper"})
@EnableDubbo(scanBasePackages = "io.seata.samples.integration.storage")
public class StorageExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageExampleApplication.class, args);
    }

}

