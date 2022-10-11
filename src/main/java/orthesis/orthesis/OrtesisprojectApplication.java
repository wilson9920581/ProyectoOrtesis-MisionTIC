package orthesis.orthesis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@EntityScan(basePackages = {"orthesis.orthesis.model"})
@SpringBootApplication(exclude =  {SecurityAutoConfiguration.class})
public class OrtesisprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrtesisprojectApplication.class, args);
    }

}
