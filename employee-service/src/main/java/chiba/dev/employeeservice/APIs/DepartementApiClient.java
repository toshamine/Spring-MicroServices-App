package chiba.dev.employeeservice.APIs;

import chiba.dev.employeeservice.DTOs.DepartementDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("DEPARTEMENT-SERVICE")
public interface DepartementApiClient {

        @GetMapping("/api/departement/get/{departementCode}")
        public DepartementDTO getByCode(@PathVariable String departementCode);



}
