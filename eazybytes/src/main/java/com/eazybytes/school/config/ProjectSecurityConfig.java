package com.eazybytes.school.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.csrf(csrf->csrf.disable()) vô hiệu hóa csrf khi không dùng th:acction của thymeleaf
		http.authorizeHttpRequests((requests)->requests
//												.requestMatchers("/contact").authenticated()//yêu cầu quền đăng nhập
//												.requestMatchers("/coursess").denyAll()//ngừng cung cấp dịch vụ cho trang web
//												
												.requestMatchers("","/","/home").permitAll()
												.requestMatchers("/contact").permitAll()
												.requestMatchers("/holidays/**").authenticated()
												.requestMatchers("/saveMsg").permitAll()
												.requestMatchers("/courses").permitAll()
												.requestMatchers("/about").permitAll()
												.requestMatchers("/assets/**").permitAll()
//												.anyRequest().permitAll()
														
				)
			.formLogin(login->login.permitAll())
			
		;
		return http.build();
		
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails user = users.username("user1").password("user1").roles("USER").build();
		UserDetails user2 = users.username("user2").password("user2").roles("USER").build();
		UserDetails admin = users.username("admin1").password("admin1").roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user,user2,admin);
	}
}
