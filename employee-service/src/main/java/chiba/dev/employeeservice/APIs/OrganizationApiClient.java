package chiba.dev.employeeservice.APIs;


import chiba.dev.employeeservice.DTOs.OrganizationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ORGANIZATION-SERVICE")
public interface OrganizationApiClient {

    @GetMapping("api/organization/get/{organizationCode}")
    public OrganizationDTO getByOrganizationCode(@PathVariable String organizationCode);
}
