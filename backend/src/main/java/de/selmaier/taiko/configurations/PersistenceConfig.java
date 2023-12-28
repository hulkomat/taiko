package de.selmaier.taiko.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "de.selmaier.taiko")
public class PersistenceConfig {}
