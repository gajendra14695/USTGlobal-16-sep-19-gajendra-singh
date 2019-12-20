package com.ustglobal.libraryms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class ORMConfig {
@Bean
public LocalEntityManagerFactoryBean getBean() {
		
		LocalEntityManagerFactoryBean beans = new LocalEntityManagerFactoryBean();
		beans.setPersistenceUnitName("librarymanagement-unit");
		return beans;
		
	}
}
