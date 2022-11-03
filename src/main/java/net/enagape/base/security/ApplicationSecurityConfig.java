package net.enagape.base.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class ApplicationSecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		/*http.authorizeHttpRequests()
				.antMatchers("/admin/").hasRole("ADMIN")
				.antMatchers("/user/profile").hasRole("Author")
				.antMatchers("/**").permitAll()
			.and()
				.formLogin()
				.loginPage("/member/login")
				.defaultSuccessUrl("/index")
				.permitAll()
			.and()
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
				.logoutSuccessUrl("/index")
				.invalidateHttpSession(true)
			.and()
				.exceptionHandling().accessDeniedPage("404");*/
		http.addFilterAfter(new CustomFilter(), BasicAuthenticationFilter.class);
		
		return http.build();
	}

	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/assets/**");
	}
}
