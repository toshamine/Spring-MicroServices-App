package chiba.organizationservice.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrganizationDTO {

    private Long Id;
    private String organizationName;
    private String organizationDesc;
    private String organizationCode;
    private LocalDateTime createdDate;
}
