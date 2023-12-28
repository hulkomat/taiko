package de.selmaier.taiko.common.entities;

import jakarta.persistence.MappedSuperclass;
import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AbstractAuditableEntity extends AbstractBaseEntity {

  @CreatedBy private UUID createdBy;

  @CreatedDate private Instant createdAt;

  @LastModifiedBy private UUID lastModifiedBy;

  @LastModifiedDate private Instant lastModifiedAt;
}
