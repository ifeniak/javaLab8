package ua.lviv.iot.JavaLab9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.JavaLab9.controllers", "ua.lviv.iot.JavaLab9.service"})
public class JavaLab9Application {

	public static void main(String[] args) {

		SpringApplication.run(JavaLab9Application.class, args);
	}

}
