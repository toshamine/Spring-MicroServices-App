package chiba.organizationservice.Utility.Mappers;

import chiba.organizationservice.Dto.OrganizationDTO;
import chiba.organizationservice.Models.Entity.Organization;

public class OrganizationMapper {

    public static OrganizationDTO mapToOrganizationDto(Organization organization){
        return OrganizationDTO.builder()
                .Id(organization.getId())
                .organizationName(organization.getOrganizationName())
                .organizationCode(organization.getOrganizationCode())
                .organizationDesc(organization.getOrganizationDesc())
                .createdDate(organization.getCreatedDate())
                .build();
    }

    public static Organization mapToOrganization(OrganizationDTO organizationDTO){
        return Organization.builder()
                .Id(organizationDTO.getId())
                .organizationName(organizationDTO.getOrganizationName())
                .organizationDesc(organizationDTO.getOrganizationDesc())
                .organizationCode(organizationDTO.getOrganizationCode())
                .createdDate(organizationDTO.getCreatedDate())
                .build();
    }
}
