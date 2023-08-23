package com.eazybytes.school.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//đăng ký đường dẫn
		registry.addViewController("/courses").setViewName("courses");
		registry.addViewController("/about").setViewName("about");
	}

}
