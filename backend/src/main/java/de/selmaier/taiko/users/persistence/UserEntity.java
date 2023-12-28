package de.selmaier.taiko.users.persistence;

import de.selmaier.taiko.common.entities.AbstractAuditableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.lang.NonNull;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "users")
public class UserEntity extends AbstractAuditableEntity {

  @NonNull private String mail;

  private String title;

  private String firstName;

  private String lastName;
}
