package com.pst.ems;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.pst.ems")
@PropertySource("classpath:data.properties")
public class MyConfig {

	


}
