package de.selmaier.taiko.common.domains;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AbstractAuditableDomain extends AbstractBaseDomain {
    
    
    private UUID createdBy;

    private Instant createdAt;

    private UUID lastModifiedBy;

    private Instant lastModifiedAt;
}
