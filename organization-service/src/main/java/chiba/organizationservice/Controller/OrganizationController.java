package chiba.organizationservice.Controller;

import chiba.organizationservice.Dto.OrganizationDTO;
import chiba.organizationservice.Service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organization")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;

    @PostMapping("/save")
    public ResponseEntity<OrganizationDTO> save(@RequestBody OrganizationDTO organizationDTO){
        OrganizationDTO saveOrganization = organizationService.save(organizationDTO);
        return new ResponseEntity<>(saveOrganization, HttpStatus.CREATED);
    }

    @GetMapping("/get/{organizationCode}")
    public ResponseEntity<OrganizationDTO> getByOrganizationCode(@PathVariable String organizationCode){
        OrganizationDTO organizationDTO = organizationService.getByOrganizationCode(organizationCode);
        return new ResponseEntity<>(organizationDTO,HttpStatus.OK);
    }
}
