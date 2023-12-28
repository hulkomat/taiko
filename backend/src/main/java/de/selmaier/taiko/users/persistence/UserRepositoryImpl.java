package de.selmaier.taiko.users.persistence;

import de.selmaier.taiko.users.core.UserDomain;
import de.selmaier.taiko.users.core.UserMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

  private final UserRepositoryJpa userRepositoryJpa;
  private final UserMapper userMapper;

  @Override
  public Optional<UserDomain> findByMail(String mail) {
    return userRepositoryJpa.findByMail(mail).map(userMapper::toDomain);
  }

  @Override
  public Page<UserDomain> getAllUsers(Pageable pageable) {
    return userRepositoryJpa.findAll(pageable).map(userMapper::toDomain);
  }
}
