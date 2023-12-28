package de.selmaier.taiko.users.persistence;

import de.selmaier.taiko.users.core.UserDomain;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepository {

  Page<UserDomain> getAllUsers(Pageable pageable);

  Optional<UserDomain> findByMail(String mail);

  UserDomain createUser(UserDomain domain);
}
