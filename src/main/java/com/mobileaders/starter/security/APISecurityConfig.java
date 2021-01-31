//package com.mobileaders.starter.security;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//public class APISecurityConfig extends WebSecurityConfigurerAdapter{
//
//	
//	 @Override
//	  protected void configure(HttpSecurity http) throws Exception {  // (2)
//	      http
//	        .authorizeRequests()
//	          .antMatchers("/getAllNews").permitAll() // (3)
//	          .anyRequest().authenticated() // (4)
//	          .and()
//	       .formLogin() // (5)
//	         .loginPage("/login") // (5)
//	         .permitAll()
//	         .and()
//	      .logout() // (6)
//	        .permitAll()
//	        .and()
//	      .httpBasic(); // (7)
//	  }
//	
//}
