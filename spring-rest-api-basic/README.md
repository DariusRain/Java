# RESTful API Basic

### Resources
- IDE: [Intellij](https://www.jetbrains.com/idea/)
- Framework: [Spring Boot](https://spring.io/projects/spring-boot)
- Database: [Postgresql](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)*

### Intitilizing spring boot maven project:
- Go to Spring's [initilizr](https://start.spring.io/) and fill out project metadata and add dependencies then you generate a boiler plate.
***Be sure to follow up on adding the dependencies from the image below***

<img src="https://github.com/DariusRain/Java/blob/1-18-21/imgs/initilizr.svg" /> 

- Comment out the "spring-boot-starter-data-jpa" tag from "project/pom.xml"
*Needed when project is ready for database connection to perform CRUD operations.*

<img src="https://github.com/DariusRain/Java/blob/master/imgs/comment-out-spring-data-jpa.gif" />


- Reload maven project (Do If no auto update) *[See here](https://github.com/DariusRain/Java/blob/master/imgs/reload-maven-project.gif)*


- Test out API root end point and give it a run.

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
----------<MODAL-NAME>/ (Package)
-------------<MODAL-NAME>.java (Modal)
-------------<MODAL-NAME>Service.java (Modal Handler methods)
-------------<MODAL-NAME>Controller.java (Modal Request handler)
----------*.*
----------ProjectName.java (Root file of spring application, it boots spring application)				
```
##### Explaination
*See and read files in [in this directory](https://github.com/DariusRain/Java-Web/tree/master/spring-rest-api-basic/src/main/java/com/coderain/springrestapibasic/user), recommended.*

Model


### Database Installation & Integration
- After downloading [postgresql](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) open the installer 
and follow article on how to go through set up wizard on [Windows](https://www.postgresqltutorial.com/install-postgresql/) or [Mac](https://www.postgresqltutorial.com/install-postgresql-macos/)

- You should now have psql on your computer,
next is on how to add postgresql to environment variables so shells can access the psql command.
    - Follow this for setting path on [Windows](https://stackoverflow.com/a/61759364/12905071)
    - Unfortunately I am not sure if you need to do this on MAC
    
  - If MAC or Windows users can't run psql command then just run the SQL shell CLI, should be included from the recent postgresql installation above
  - SQL Shell CLI (psql)  
    <img src="https://github.com/DariusRain/Java/blob/master/imgs/postgresql-shell-getting-started.gif" />
      
  - Any Commandline on OS (If Path can be set system's environment variables)
    <img src="https://github.com/DariusRain/Java/blob/master/imgs/postgresql-shell-any.gif" />

