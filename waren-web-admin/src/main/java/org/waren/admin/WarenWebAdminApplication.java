package org.waren.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.waren.admin")
public class WarenWebAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarenWebAdminApplication.class, args);
	}
}
