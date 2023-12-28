package de.selmaier.taiko.users;

import java.util.Optional;

public interface UserRepository {
    
    Optional<UserDomain> findByMail(String mail);
}
