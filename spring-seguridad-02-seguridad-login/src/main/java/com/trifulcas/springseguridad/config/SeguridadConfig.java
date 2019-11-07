package com.trifulcas.springseguridad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("juan")
				.password(passwordEncoder().encode("1234")).roles("EMPLEADO");
		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("ana")
				.password(passwordEncoder().encode("1234")).roles("GERENTE");
		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("eva")
				.password(passwordEncoder().encode("1234")).roles("ADMIN");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated()
				.and().formLogin().loginPage("/formlogin")
				.loginProcessingUrl("/authenticateTheUser").permitAll()
				.and().logout().permitAll();
	}

}
