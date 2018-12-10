/**
 * 
 */
package org.waren;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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

		new SpringApplicationBuilder(WarenServiceAdminApplication.class).web(WebApplicationType.NONE).run(args);
	}
}
