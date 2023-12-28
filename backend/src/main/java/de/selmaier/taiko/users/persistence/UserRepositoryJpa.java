package de.selmaier.taiko.users.persistence;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJpa extends JpaRepository<UserEntity, UUID> {

  Optional<UserEntity> findByMail(String mail);
}
