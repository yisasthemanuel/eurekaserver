package org.jlobato.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class YisasEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YisasEurekaServerApplication.class, args);
		log.info("The Yisas Eureka Server is ready to dispatch requests!");
	}

}
