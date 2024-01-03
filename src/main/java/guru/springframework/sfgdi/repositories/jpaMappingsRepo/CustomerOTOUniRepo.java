package guru.springframework.sfgdi.repositories.jpaMappingsRepo;

import guru.springframework.sfgdi.models.OTOM.CustomerOTOUniM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOTOUniRepo extends JpaRepository<CustomerOTOUniM,Long> {
}
