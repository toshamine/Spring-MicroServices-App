package chiba.organizationservice.Service;

import chiba.organizationservice.Dto.OrganizationDTO;
import chiba.organizationservice.Models.Entity.Organization;
import chiba.organizationservice.Repo.OrganizationRepo;
import chiba.organizationservice.Utility.Mappers.OrganizationMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationService {

    private OrganizationRepo organizationRepo;


    public OrganizationDTO save(OrganizationDTO organizationDTO){
        Organization organization = organizationRepo.save(OrganizationMapper.mapToOrganization(organizationDTO));
        return OrganizationMapper.mapToOrganizationDto(organization);
    }

    public OrganizationDTO getByOrganizationCode(String organizationCode){
        Organization organization = organizationRepo.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
