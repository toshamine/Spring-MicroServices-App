package chiba.dev.departementservice.DTOs;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DepartementDTO {

    private Long id;
    private String departementName;
    private String departementDesc;
    private String departementCode;
}
