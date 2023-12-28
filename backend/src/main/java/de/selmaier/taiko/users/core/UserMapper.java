package de.selmaier.taiko.users.core;

import de.selmaier.taiko.users.adapter.UserDto;
import de.selmaier.taiko.users.persistence.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

  UserDto toDto(UserDomain userDomain);

  UserDomain toDomain(UserEntity userEntity);
}
