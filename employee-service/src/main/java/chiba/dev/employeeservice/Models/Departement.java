package chiba.dev.employeeservice.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement {

    private Long id;
    private String departementName;
    private String departementDesc;
    private String departementCode;
    private String organizationCode;
}
