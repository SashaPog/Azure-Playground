package demoapp.azuredemokv;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AzureDemoKvApplication {
    @Value("${greencity.secret.name}")
    private String secretName;

    public static void main(String[] args) {
        SpringApplication.run(AzureDemoKvApplication.class, args);
    }

    @PostConstruct
    public void logSecret() {
        log.info("Secret name = {}", secretName);
    }
}
