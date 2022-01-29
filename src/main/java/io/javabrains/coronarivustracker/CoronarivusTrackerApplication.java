package io.javabrains.coronarivustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronarivusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronarivusTrackerApplication.class, args);
	}

}
