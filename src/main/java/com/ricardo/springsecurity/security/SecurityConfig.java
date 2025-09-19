package com.ricardo.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        //permitAll() 表示无需认证
        //hasRole() 表示需要角色授权认证
        //authenticated() 表示需要登陆认证
        return httpSecurity.authorizeHttpRequests((request) -> {
                    request.requestMatchers("/", "/user/hello").authenticated();
                }).build();
    }
}
