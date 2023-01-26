package chiba.dev.departementservice.Services;

import chiba.dev.departementservice.DTOs.DepartementDTO;
import chiba.dev.departementservice.Models.Departement;
import chiba.dev.departementservice.Repos.DepartementRepo;
import chiba.dev.departementservice.Utility.Mappers.DepartementMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartementService {

    private DepartementRepo departementRepo;

    public DepartementDTO create(DepartementDTO departementDTO){
        Departement departement = DepartementMapper.mapDepartementDtoToDepartement(departementDTO);
        departement = departementRepo.save(departement);
        return DepartementMapper.mapDepartementToDepartementDto(departement);
    }

    public DepartementDTO getByCode(String departementCode){
        Departement departement = departementRepo.findByDepartementCode(departementCode);
        return DepartementMapper.mapDepartementToDepartementDto(departement);
    }
}
