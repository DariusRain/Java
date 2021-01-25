package com.coderain.springrestapibasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
* <h1>SpringRestApiBasicApplication</h1>
* <p>
*    I know it is a long name in this case, but this is the name of your application.
 *    Also this is where Spring runs application from its core with as you see below the run() method,
 *    all of the annotations matter notice "@SpringBootApplication" these annotations are a cruical part
 *    of Spring's ability to compile and read your program.  As you see throughout other files annotations
 *    are used quite frequently and can cause errors without them.  So the annotation in this file is
 *    letting the Spring Boot framework know that this is the root of your spring application.
 *    Normally this file would remain very plain or with additional packages added for further integrations.
* </p>
* @author  Darius Rain
* @version 1.0
* @since   21-1-24
*/
@SpringBootApplication
public class SpringRestApiBasicApplication {

	/**
	* Boots spring application, notice the "SpringApplication.run(<YOUR-APPLICATION>, args)"
	 * as Java developers know there must be a main method in a Class that represents the root
	 * of the application sorry to repeat myself but this is just simply the root of the application.
	* @param String[] args -> This is here so you can configure your application if you were to pass
	 * arguments before after file execution statement in a command line environment holding your app.
	* @retun Instantiates a servlet process that runs on device until termination by any means.
	*/
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiBasicApplication.class, args);
	}
}
