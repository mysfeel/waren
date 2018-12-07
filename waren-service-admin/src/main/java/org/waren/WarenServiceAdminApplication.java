/**
 * 
 */
package org.waren;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * @author think
 *
 */
@Configuration
@SpringBootApplication
public class WarenServiceAdminApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		SpringApplication.run(AdminApplication.class, args);
		new SpringApplicationBuilder(WarenServiceAdminApplication.class)
        .web(WebApplicationType.NONE)
        .run(args);
	}
}
