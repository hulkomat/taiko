package de.selmaier.taiko.configurations;

import de.selmaier.taiko.users.UserMapperImpl;
import de.selmaier.taiko.users.core.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

  @Bean
  public UserMapper userMapper() {
    return new UserMapperImpl();
  }
}
