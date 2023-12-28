package de.selmaier.taiko.users.core;

import de.selmaier.taiko.common.domains.AbstractAuditableDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserDomain extends AbstractAuditableDomain {

  private String mail;
  private String title;
  private String firstName;
  private String lastName;
}
