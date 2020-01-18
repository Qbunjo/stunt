package pl.jakalski.stunt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class StuntApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuntApplication.class, args);
    }

}
