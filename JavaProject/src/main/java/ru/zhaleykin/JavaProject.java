package ru.zhaleykin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ru.zhaleykin.repository")
public class JavaProject {

	public static void main(String[] args) {
		SpringApplication.run(JavaProject.class);
	}
}