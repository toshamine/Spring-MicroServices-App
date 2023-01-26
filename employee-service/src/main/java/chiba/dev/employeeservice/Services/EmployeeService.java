package chiba.dev.employeeservice.Services;

import chiba.dev.employeeservice.APIs.DepartementApiClient;
import chiba.dev.employeeservice.APIs.OrganizationApiClient;
import chiba.dev.employeeservice.DTOs.DepartementDTO;
import chiba.dev.employeeservice.DTOs.EmployeeDTO;
import chiba.dev.employeeservice.DTOs.OrganizationDTO;
import chiba.dev.employeeservice.DTOs.Responses.APIResponseDTO;
import chiba.dev.employeeservice.Models.Entities.Employee;
import chiba.dev.employeeservice.Repos.EmployeeRepo;
import chiba.dev.employeeservice.Utility.Mappers.DepartementMapper;
import chiba.dev.employeeservice.Utility.Mappers.EmployeeMapper;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    private DepartementApiClient departementApiClient;

    private OrganizationApiClient organizationApiClient;

    public EmployeeDTO create(EmployeeDTO employeeDTO){
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        employee = employeeRepo.save(employee);
        return EmployeeMapper.mapToEmployeeDTO(employee);
    }

    @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartement")
    //@Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartement")
    public APIResponseDTO getById(Long id){
        Employee employee = employeeRepo.findById(id).get();
        DepartementDTO departement = departementApiClient.getByCode(employee.getDepartementCode());
        OrganizationDTO organization = organizationApiClient.getByOrganizationCode(employee.getOrganizationCode());
        return APIResponseDTO.builder()
                .employee(EmployeeMapper.mapToEmployeeDTO(employee))
                .departement(departement)
                .organization(organization)
                .build();
    }

    public APIResponseDTO getDefaultDepartement(Long id,Exception exception){
        Employee employee = employeeRepo.findById(id).get();
        DepartementDTO departement = DepartementDTO.builder()
                .departementCode("0000")
                .departementDesc("This Is The Default Departement")
                .departementName("Default Departement")
                .id((long)0)
                .build();
        OrganizationDTO organization = OrganizationDTO.builder()
                .organizationCode("0000")
                .organizationName("Default Organization")
                .organizationDesc("This Is The Default Organization")
                .createdDate(LocalDateTime.now())
                .Id((long)0)
                .build();
        return APIResponseDTO.builder()
                .employee(EmployeeMapper.mapToEmployeeDTO(employee))
                .departement(departement)
                .organization(organization)
                .build();
    }
}
