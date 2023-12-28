package de.selmaier.taiko.users.core;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

  Page<UserDomain> getAllUsers(Pageable pageable);
}
