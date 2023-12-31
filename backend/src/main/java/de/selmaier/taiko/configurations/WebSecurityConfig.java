package de.selmaier.taiko.configurations;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    // XorCsrfTokenRequestAttributeHandler delegate = new XorCsrfTokenRequestAttributeHandler();
    // // set the name of the attribute the CsrfToken will be populated on
    // delegate.setCsrfRequestAttributeName("XSRF-TOKEN");
    // // Use only the handle() method of XorCsrfTokenRequestAttributeHandler and the
    // // default implementation of resolveCsrfTokenValue() from CsrfTokenRequestHandler
    // CsrfTokenRequestHandler requestHandler = delegate::handle;

    http.cors(cors -> cors.configurationSource(taikoCorsConfigurationSource()))
        /* (if we want to enable csrf protection) we should use this part again, including the part above)
        .csrf(
            csrf ->
                csrf.csrfTokenRepository(withHttpOnlyFalse())
                    .csrfTokenRequestMatcher(new AntPathRequestMatcher("/api/**"))
                    .csrfTokenRequestHandler(requestHandler)) */

        .csrf(CsrfConfigurer::disable)
        .sessionManagement(
            session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .authorizeHttpRequests(
            authorize ->
                authorize
                    .requestMatchers(HttpMethod.OPTIONS, "/**")
                    .permitAll()
                    .requestMatchers("/api/auth/login", "/actuator/**")
                    .permitAll()
                    .anyRequest()
                    .authenticated())
        .formLogin(FormLoginConfigurer::disable)
        .httpBasic(HttpBasicConfigurer::disable);
    return http.build();
  }

  private CorsConfigurationSource taikoCorsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
    configuration.setAllowedMethods(Arrays.asList("*"));
    configuration.setAllowedHeaders(Arrays.asList("*"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
  }
}
