#Java Web

### RESTful API Basic
Resources
- IDE: [Intellij](https://www.jetbrains.com/idea/)
- Framework: [Spring Boot](https://spring.io/projects/spring-boot)
- Database: [Postgresql](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)

##### Getting started:
*See source code [here](https://github.com/DariusRain/Java/tree/1-18-21/spring-rest-api-basic)*

- Go to Spring's [initilizr](https://start.spring.io/) and generate a boiler plate or just [click here](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.2.RELEASE&packaging=jar&jvmVersion=15&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=data-jpa,web,postgresql)
<img src="https://github.com/DariusRain/Java/blob/1-18-21/imgs/initilizr.svg" /> 

- Comment the "spring-boot-starter-data-jpa" tag from "project/pom.xml"
	- Needed when project is ready for database connection to perform CRUD operations.

- Reload maven project (Do If no auto update)
	- Right click "pom.xml" file then select "maven" from menu then click "reload project"

- Test out endpoints


##### Design Pattern:

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


##### Instalation of db
