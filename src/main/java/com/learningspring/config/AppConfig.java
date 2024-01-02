package com.learningspring.config;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

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
            http.csrf(new Customizer<CsrfConfigurer<HttpSecurity>>() {
                @Override
                public void customize(CsrfConfigurer<HttpSecurity> httpSecurityCsrfConfigurer) {
                    httpSecurityCsrfConfigurer.disable();
                }
            });
            return http.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    // NOT THE RECOMMENDED WAY TO STORE PASSWORDS UDER AND PRODUCTION SCENARIO
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
