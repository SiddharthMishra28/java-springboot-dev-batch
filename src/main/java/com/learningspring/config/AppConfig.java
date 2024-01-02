package com.learningspring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class AppConfig {


    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http){
        try {
            http.authorizeHttpRequests((requests)->requests
                            .requestMatchers("/api", "/api/**").authenticated()
                            .requestMatchers("/home", "/home/**").permitAll())
//                    .formLogin(Customizer.withDefaults())
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        UserDetails adminUser = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("password123")
                .authorities("ADMIN")
                .build();
        UserDetails regularUser = User.withDefaultPasswordEncoder()
                .username("user")
                .password("genericpassword")
                .authorities("USER")
                .build();
        return new InMemoryUserDetailsManager(adminUser, regularUser);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
        return new BCryptPasswordEncoder();
    }
}
