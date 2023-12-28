package de.selmaier.taiko.users.persistence;

import de.selmaier.taiko.users.core.UserDomain;
import de.selmaier.taiko.users.core.UserMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

  private final UserRepositoryJpa userRepositoryJpa;
  private final UserMapper userMapper;

  @Override
  public Optional<UserDomain> findByMail(String mail) {
    return userRepositoryJpa.findByMail(mail).map(userMapper::toDomain);
  }
}
