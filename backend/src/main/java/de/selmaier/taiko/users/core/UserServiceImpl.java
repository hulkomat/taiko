package de.selmaier.taiko.users.core;

import de.selmaier.taiko.users.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public Page<UserDomain> getAllUsers(Pageable pageable) {
    return userRepository.getAllUsers(pageable);
  }
}
