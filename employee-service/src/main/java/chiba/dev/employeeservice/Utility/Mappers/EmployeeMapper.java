package chiba.dev.employeeservice.Utility.Mappers;

import chiba.dev.employeeservice.DTOs.EmployeeDTO;
import chiba.dev.employeeservice.Models.Entities.Employee;

public class EmployeeMapper {

    public static EmployeeDTO mapToEmployeeDTO(Employee employee){
        return EmployeeDTO.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .departementCode(employee.getDepartementCode())
                .organizationCode(employee.getOrganizationCode())
                .build();
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO){
        return Employee.builder()
                .id(employeeDTO.getId())
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .departementCode(employeeDTO.getDepartementCode())
                .organizationCode(employeeDTO.getOrganizationCode())
                .build();
    }
}
