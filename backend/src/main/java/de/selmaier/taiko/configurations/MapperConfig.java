package de.selmaier.taiko.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.selmaier.taiko.users.UserMapper;
import de.selmaier.taiko.users.UserMapperImpl;

@Configuration
public class MapperConfig {

    @Bean
    public UserMapper userMapper() {
        return new UserMapperImpl();
    }
    
}
