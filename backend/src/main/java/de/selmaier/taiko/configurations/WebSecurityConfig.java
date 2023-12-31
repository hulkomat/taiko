package de.selmaier.taiko.configurations;

// @Configuration
// @EnableWebSecurity
public class WebSecurityConfig {

  // @Bean
  // public SecurityWebFilterChain springWebFilterChain(ServerHttpSecurity http) {

  //   // XorCsrfTokenRequestAttributeHandler delegate = new XorCsrfTokenRequestAttributeHandler();
  //   // // set the name of the attribute the CsrfToken will be populated on
  //   // delegate.setCsrfRequestAttributeName("XSRF-TOKEN");
  //   // // Use only the handle() method of XorCsrfTokenRequestAttributeHandler and the
  //   // // default implementation of resolveCsrfTokenValue() from CsrfTokenRequestHandler
  //   // CsrfTokenRequestHandler requestHandler = delegate::handle;

  //   http
  //       // .cors(cors -> cors.configurationSource(taikoCorsConfigurationSource()))
  //       /* (if we want to enable csrf protection) we should use this part again, including the
  // part above)
  //       .csrf(
  //           csrf ->
  //               csrf.csrfTokenRepository(withHttpOnlyFalse())
  //                   .csrfTokenRequestMatcher(new AntPathRequestMatcher("/api/**"))
  //                   .csrfTokenRequestHandler(requestHandler)) */

  //       // .csrf(CsrfConfigurer::disable)
  //       // .sessionManagement(
  //       //     session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
  //       .authorizeExchange(
  //       authorize ->
  //           authorize
  //               .pathMatchers("/api/auth/login")
  //               .permitAll()
  //               .pathMatchers("/actuator/**")
  //               .permitAll()
  //               .anyExchange()
  //               .authenticated());
  //   return http.build();
  // }

  // // private CorsConfigurationSource taikoCorsConfigurationSource() {
  // //   CorsConfiguration configuration = new CorsConfiguration();
  // //   configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
  // //   configuration.setAllowedMethods(Arrays.asList("*"));
  // //   configuration.setAllowedHeaders(Arrays.asList("*"));
  // //   UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
  // //   source.registerCorsConfiguration("/**", configuration);
  // //   return source;
  // // }

  // @Bean
  // public AuthenticationManager authenticationManager(
  //     UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
  //   DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
  //   authenticationProvider.setUserDetailsService(userDetailsService);
  //   authenticationProvider.setPasswordEncoder(passwordEncoder);

  //   return new ProviderManager(authenticationProvider);
  // }

  // @Bean
  // public UserDetailsService userDetailsService() {
  //   UserDetails userDetails =
  //       User.withDefaultPasswordEncoder()
  //           .username("user")
  //           .password("password")
  //           .roles("USER")
  //           .build();

  //   return new InMemoryUserDetailsManager(userDetails);
  // }

  // @Bean
  // public PasswordEncoder passwordEncoder() {
  //   return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  // }
}
