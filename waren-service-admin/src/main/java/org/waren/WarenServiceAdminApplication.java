/**
 * 
 */
package org.waren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author think
 *
 */
@SpringBootApplication
public class WarenServiceAdminApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		new SpringApplicationBuilder(WarenServiceAdminApplication.class).web(WebApplicationType.NONE).run(args);
		SpringApplication.run(WarenServiceAdminApplication.class, args);
	}
}
