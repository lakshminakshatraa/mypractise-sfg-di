package guru.springframework.sfgdi.repositories.jpaMappingsRepo;

import guru.springframework.sfgdi.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Long> {
}
