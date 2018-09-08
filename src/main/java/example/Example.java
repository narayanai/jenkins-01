package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example extends SpringBootServletInitializer {

	@RequestMapping("/welcome")
	String home() {
		return "Hello World! This is a sample spring boot application using Git, Jenkins !";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Example.class);
	}

}
