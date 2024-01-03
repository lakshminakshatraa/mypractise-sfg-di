package guru.springframework.sfgdi.services.jpaMappings;

import guru.springframework.sfgdi.models.Customer;
import guru.springframework.sfgdi.models.OTOM.ShippingAddressOTOUniM;
import guru.springframework.sfgdi.repositories.jpaMappingsRepo.CustomerOTOUniRepo;
import guru.springframework.sfgdi.repositories.jpaMappingsRepo.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;
    private final CustomerOTOUniRepo customerOTOUniRepo;

    public CustomerService(CustomerRepo customerRepo, CustomerOTOUniRepo customerOTOUniRepo) {
        this.customerRepo = customerRepo;
        this.customerOTOUniRepo = customerOTOUniRepo;
    }

    public Customer saveCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public Customer saveCustOTO(Customer customer){
        ShippingAddressOTOUniM shippingAddressOTOUniM = new ShippingAddressOTOUniM();
        shippingAddressOTOUniM.setCity("Detroit");
        shippingAddressOTOUniM.setState("MI");

        customer.setShippingAddress(shippingAddressOTOUniM);
        return null;
    }
}
