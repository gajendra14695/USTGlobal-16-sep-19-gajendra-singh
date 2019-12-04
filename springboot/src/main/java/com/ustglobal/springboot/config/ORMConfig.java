package com.ustglobal.springboot.config;

import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//@Configuration
public class ORMConfig {

	//@Bean
	public LocalEntityManagerFactoryBean getBean() {
		
		LocalEntityManagerFactoryBean bean =new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("employee-unit");
		return bean;
	}
}
