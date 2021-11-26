package market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(RegistryServerApplication.class, args);
    }

}
