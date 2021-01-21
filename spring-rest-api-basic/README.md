# RESTful API Basic

### Resources
- IDE: [Intellij](https://www.jetbrains.com/idea/)
- Framework: [Spring Boot](https://spring.io/projects/spring-boot)
- Database: [Postgresql](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)*

### Intitilizing spring boot maven project:
- Go to Spring's [initilizr](https://start.spring.io/) and generate a boiler plate or just [click here](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.2.RELEASE&packaging=jar&jvmVersion=15&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=data-jpa,web,postgresql)
<img src="https://github.com/DariusRain/Java/blob/1-18-21/imgs/initilizr.svg" /> 

- Comment the "spring-boot-starter-data-jpa" tag from "project/pom.xml"
	- Needed when project is ready for database connection to perform CRUD operations.

- Reload maven project (Do If no auto update)
	- Right click "pom.xml" file then select "maven" from menu then click "reload project"

- Test out endpoints, add the code then give it a run
```Java
// Running test

package com.coderain.springrestapibasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Notice the annotations
@SpringBootApplication // This lets spring know that this is the root of app
@RestController // Lets Spring know requests can be made in this class 
public class SpringRestApiBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiBasicApplication.class, args);
	}

	// Test page
	@GetMapping
	public String test() {
		return "Test Page";
	}
}
```
- Run program and open browser and should see
  <img src="https://github.com/DariusRain/Java/blob/master/imgs/test-page.png" />


&nbsp;

### API Design Pattern:
<img src="https://github.com/DariusRain/Java/blob/master/imgs/design-pattern.gif" /> 

```
project/
--*.* (Maven & IDE related files including "pom.xml" where dependencies can be injected)
--src/
----main/
------*.* 
------java/
--------project-name/
----------name/ (lowercase/New Package)
------------Name.java (Modal)
------------NameService.java (Handler methods)
------------NameController.java (Request handler)
----------*.*
----------ProjectName.java (Root file of spring application, it boots spring application)				
```




### Database Installation & Integration
- After downloading [postgresql](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) open the installer 
and follow article on how to go through set up wizard on [Windows](https://www.postgresqltutorial.com/install-postgresql/) or [MAC](https://www.postgresqltutorial.com/install-postgresql-macos/)

- Open the open