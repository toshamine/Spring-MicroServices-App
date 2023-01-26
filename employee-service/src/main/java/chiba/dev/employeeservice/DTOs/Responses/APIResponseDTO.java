package chiba.dev.employeeservice.DTOs.Responses;

import chiba.dev.employeeservice.DTOs.DepartementDTO;
import chiba.dev.employeeservice.DTOs.EmployeeDTO;
import chiba.dev.employeeservice.DTOs.OrganizationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class APIResponseDTO {

    private EmployeeDTO employee;
    private DepartementDTO departement;
    private OrganizationDTO organization;
}
