package de.selmaier.taiko.users;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDto toDto(UserDomain userDomain);

    UserDomain toDomain(UserEntity userEntity);
    
}
