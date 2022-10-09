package com.masai.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BlogSecurityConfig {

    @Bean
    public SecurityFilterChain blogUserSecurity(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeHttpRequests(auth ->
                {
                    try {
                        auth
                                .antMatchers("/register","/login").permitAll()
                                .antMatchers("/posts","/comment").authenticated()
                                .and()
                                .csrf()
                                .disable();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                ).httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
}
