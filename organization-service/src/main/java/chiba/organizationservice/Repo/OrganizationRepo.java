package chiba.organizationservice.Repo;

import chiba.organizationservice.Models.Entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepo extends JpaRepository<Organization,Long> {

    public Organization findByOrganizationCode(String organizationCode);
}
