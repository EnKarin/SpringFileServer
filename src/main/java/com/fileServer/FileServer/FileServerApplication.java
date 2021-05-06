package com.fileServer.FileServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FileServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(FileServerApplication.class, args);
	}
}