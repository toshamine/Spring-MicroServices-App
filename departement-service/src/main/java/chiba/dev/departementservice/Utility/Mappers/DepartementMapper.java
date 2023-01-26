package chiba.dev.departementservice.Utility.Mappers;

import chiba.dev.departementservice.DTOs.DepartementDTO;
import chiba.dev.departementservice.Models.Departement;

public class DepartementMapper {

    public static DepartementDTO mapDepartementToDepartementDto(Departement departement){
        return DepartementDTO.builder()
                .id(departement.getId())
                .departementName(departement.getDepartementName())
                .departementDesc(departement.getDepartementDesc())
                .departementCode(departement.getDepartementCode())
                .build();
    }

    public static Departement mapDepartementDtoToDepartement(DepartementDTO departementDTO){
        return Departement.builder()
                .id(departementDTO.getId())
                .departementName(departementDTO.getDepartementName())
                .departementDesc(departementDTO.getDepartementDesc())
                .departementCode(departementDTO.getDepartementCode())
                .build();
    }
}
