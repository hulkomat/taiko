package de.selmaier.taiko.users.core;

import org.springframework.data.domain.Page;

public interface UserService {

  Page<UserDomain> getAllUsers();
}
