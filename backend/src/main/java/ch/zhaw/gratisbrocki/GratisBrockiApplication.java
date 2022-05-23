package ch.zhaw.gratisbrocki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GratisBrockiApplication {

    public static void main(String[] args) {

        SpringApplication.run(GratisBrockiApplication.class, args);
        System.out.println("Hello Ben & Andy !"); // ./mvnw spring-boot:run
    }
}
