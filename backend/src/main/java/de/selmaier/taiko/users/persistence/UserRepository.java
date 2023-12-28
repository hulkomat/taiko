package de.selmaier.taiko.users.persistence;

import de.selmaier.taiko.users.core.UserDomain;
import java.util.Optional;

public interface UserRepository {

  Optional<UserDomain> findByMail(String mail);
}
