package de.selmaier.taiko.users;

import de.selmaier.taiko.common.entities.AbstractAuditableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "users")
public class UserEntity extends AbstractAuditableEntity {
    
    private String password;
    private String mail;
    private String title;
    private String firstName;
    private String lastName;
}
