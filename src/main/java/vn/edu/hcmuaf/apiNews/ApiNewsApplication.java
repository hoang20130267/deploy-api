package vn.edu.hcmuaf.apiNews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiNewsApplication {
	public String PORT = System.getenv("PORT");

	public static void main(String[] args) {
		SpringApplication.run(ApiNewsApplication.class, args);
	}

}
