package com.girnarsoft.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.girnarsoft.sso.persistence.dao")
@EntityScan("org.girnarsoft.sso.persistence.model")
public class SsoApplication extends  SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SsoApplication.class, args);
	}

}
