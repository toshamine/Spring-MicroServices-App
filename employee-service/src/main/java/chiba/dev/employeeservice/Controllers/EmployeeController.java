package chiba.dev.employeeservice.Controllers;

import chiba.dev.employeeservice.DTOs.EmployeeDTO;
import chiba.dev.employeeservice.DTOs.Responses.APIResponseDTO;
import chiba.dev.employeeservice.Services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<EmployeeDTO> create(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO savedEmployee = employeeService.create(employeeDTO);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<APIResponseDTO> getById(@PathVariable Long id){
        APIResponseDTO response = employeeService.getById(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}
