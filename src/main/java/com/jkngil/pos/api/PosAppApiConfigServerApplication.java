package com.jkngil.pos.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PosAppApiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosAppApiConfigServerApplication.class, args);
	}

}
