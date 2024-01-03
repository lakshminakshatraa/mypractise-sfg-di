package guru.springframework.sfgdi.repositories.jpaMappingsRepo;

import guru.springframework.sfgdi.models.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingAddressRepo extends JpaRepository<ShippingAddress,Long> {
}
