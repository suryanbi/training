package com.example.demo.entity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
//		auth.inMemoryAuthentication().withUser("India")
//			.password(encoder.encode("India"))
//				.roles("ADMIN")
//					.and()
//						.withUser("Nepal")
//							.password(encoder.encode("Nepal"))
//								.roles("GUEST");
		
		String sql ="select u.user_name, a.authority from spc_authorities a, spc_users u where u.user_name=? AND u.user_name = a.user_name";
		
		auth.jdbcAuthentication().dataSource(dataSource)
					.usersByUsernameQuery("select user_name,password,enabled from spc_users where user_name=?").authoritiesByUsernameQuery
					(sql).passwordEncoder(encoder);
	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests().antMatchers("/api/v1/**")
			.authenticated()
				.and()
					.httpBasic();
		
		
	}
	
	
	

}
