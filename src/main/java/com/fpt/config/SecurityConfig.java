package com.fpt.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * 
 * @author TungLT25
 * @date Jul 25, 2018
 */

@Configuration
@EnableCaching
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
    	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.authorizeRequests()
        // configs for swagger
		.antMatchers("/v2/**").permitAll()
		.antMatchers("/webjars/**").permitAll()
		.antMatchers("/swagger*/**").permitAll()
        .anyRequest().permitAll()
        .and().httpBasic();
    
//    http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
    
    // disable page caching
    http.headers().cacheControl();
    
    http.headers().contentTypeOptions().disable();
	}

	
}
