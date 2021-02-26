package ru.vladigeras.kafkasimple;

import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSimpleApplication.class, args);
    }

    @PostConstruct
    public void setGlobalUtcDate() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}
