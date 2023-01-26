package chiba.dev.departementservice.Controllers;

import chiba.dev.departementservice.DTOs.DepartementDTO;
import chiba.dev.departementservice.Services.DepartementService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/departement")
public class DepartementController {

    private DepartementService departementService;

    @PostMapping("/create")
    public ResponseEntity<DepartementDTO> create(@RequestBody DepartementDTO departementDTO){
        DepartementDTO savedDepartement = departementService.create(departementDTO);
        return new ResponseEntity<>(savedDepartement, HttpStatus.CREATED);
    }

    @GetMapping("/get/{departementCode}")
    public ResponseEntity<DepartementDTO> getByCode(@PathVariable String departementCode){
        DepartementDTO departementDTO = departementService.getByCode(departementCode);
        return new ResponseEntity<>(departementDTO,HttpStatus.OK);
    }
}
