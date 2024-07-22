package com.in28minutes.springboot.learn_jpa_and_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc")
//@EnableJdbcRepositories(basePackages ="package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc")
//@EntityScan(basePackages = "package com.in28minutes.springboot.learn_jpa_and_hibernate.courses")
public class DemoProjectForSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectForSpringBootApplication.class, args);
	}

}
