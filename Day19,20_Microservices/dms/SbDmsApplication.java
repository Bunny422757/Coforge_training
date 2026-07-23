package com.coforge.dms;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import jdk.jfr.Enabled;

@SpringBootApplication
@EnableDiscoveryClient
public class SbDmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDmsApplication.class, args);
	}

}
