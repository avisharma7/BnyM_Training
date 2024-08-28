package com.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class MySecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Disables CSRF protection
                // Authorize all requests
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/public/**").hasRole("NORMAL")
                        .requestMatchers("/users/**").hasRole("ADMIN")

                        .anyRequest().authenticated()  // Require authentication for all requests
                )
                // Enable Basic Authentication
                .httpBasic()
                // Disable form login (since we're using Basic Authentication only)
                .and().formLogin().disable();

        return http.build();
    }

    // Define in-memory authentication with users
    @Bean
    public UserDetailsService userDetailsService() {
        // Creating two users, one with the NORMAL role and another with ADMIN role
        UserDetails user1 = User.builder()
                .username("john")
                .password(passwordEncoder().encode("durgesh"))
                .roles("NORMAL")
                .build();

        UserDetails user2 = User.builder()
                .username("roshni")
                .password(passwordEncoder().encode("abc"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }

    // Using BCryptPasswordEncoder for password encoding
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);  // Strength of 10
    }
}

/*Note

role - high level overview  -> role => NOrmal
Authority:  permission  -> normal role has read permission :: permision is read
admin's permision (authority) can be  read write and update
 */