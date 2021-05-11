package com.ipru.mca.mcadiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class McaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(McaDiscoveryApplication.class, args);
	}

}
