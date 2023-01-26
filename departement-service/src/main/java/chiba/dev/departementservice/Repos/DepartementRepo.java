package chiba.dev.departementservice.Repos;

import chiba.dev.departementservice.Models.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepo extends JpaRepository<Departement,Long> {

    public Departement findByDepartementCode(String departementCode);
}
