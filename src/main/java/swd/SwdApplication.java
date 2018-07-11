package swd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SwdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwdApplication.class, args);
	}
}
