package chiba.dev.employeeservice.Repos;

import chiba.dev.employeeservice.Models.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
