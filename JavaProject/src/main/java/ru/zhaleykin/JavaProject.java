package ru.zhaleykin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.zhaleykin.rabbitmq.RabbitConfiguration;

@SpringBootApplication
@EnableJpaRepositories("ru.zhaleykin.repository")
@Import(RabbitConfiguration.class)
public class JavaProject {
	public static void main(String[] args) {
		SpringApplication.run(JavaProject.class);
	}
}