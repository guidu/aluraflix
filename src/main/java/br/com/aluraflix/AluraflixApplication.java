package br.com.aluraflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AluraflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraflixApplication.class, args);
	}

}
