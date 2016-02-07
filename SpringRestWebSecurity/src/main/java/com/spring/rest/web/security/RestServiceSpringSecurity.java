package com.spring.rest.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
@EnableWebSecurity
public class RestServiceSpringSecurity extends WebSecurityConfigurerAdapter {

	
	@Autowired
	public void configureSecurity(AuthenticationManagerBuilder authBuilder) {
		try {
			authBuilder.inMemoryAuthentication().withUser("abc").password("abc").roles("ADMIN");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/**").permitAll().antMatchers("/**").access("hasRole('ADMIN')");
	}
}
