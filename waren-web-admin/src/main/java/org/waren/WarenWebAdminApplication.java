package org.waren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.waren.controller")
public class WarenWebAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarenWebAdminApplication.class, args);
	}
}
