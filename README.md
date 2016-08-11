# SpringMVC
a simple spring mvc project to experiment using Spring Boot


###Why Spring Boot is not loading Spring MVC and is closing immediately after starting the spring boot application?
Spring Boot needs an application container like tomcat to load MVC files.
Add the following dependency to the pom.xml file:
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
	<version>1.4.0.RELEASE</version>
</dependency>
```
