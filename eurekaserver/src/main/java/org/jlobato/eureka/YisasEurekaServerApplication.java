package org.jlobato.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YisasEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YisasEurekaServerApplication.class, args);
	}

}
