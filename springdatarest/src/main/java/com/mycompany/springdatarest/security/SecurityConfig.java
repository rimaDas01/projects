package com.mycompany.springdatarest.security;



import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



public class SecurityConfig extends WebSecurityConfigurerAdapter {



   public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("user")).roles("USER").and()
        .withUser("admin").roles("ADMIN");
        
    }
        @Bean
        PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
        
        @Override
        protected void configure(HttpSecurity http) throws Exception {                
            http             
            .authorizeRequests()               
            .antMatchers(HttpMethod.GET,"/api/employee/**")   
            .hasRole("USER")             
            .anyRequest()             
            .authenticated()            
            .and()             
            .httpBasic();           
            http.csrf().disable();
        }
        
        
}