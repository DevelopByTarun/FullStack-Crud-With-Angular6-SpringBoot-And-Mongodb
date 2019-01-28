package com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAutoConfiguration 
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb")
@SpringBootApplication
public class MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodbApplication.class, args);
	}

}

