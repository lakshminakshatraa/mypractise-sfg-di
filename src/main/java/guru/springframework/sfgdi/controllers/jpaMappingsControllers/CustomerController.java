package guru.springframework.sfgdi.controllers.jpaMappingsControllers;

import guru.springframework.sfgdi.models.Customer;
import guru.springframework.sfgdi.models.OTOM.CustomerOTOUniM;
import guru.springframework.sfgdi.services.jpaMappings.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/data")
    public Customer saveCustInfo(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @PostMapping("/otouni")
    public CustomerOTOUniM saveOTOUniCustInfo(@RequestBody CustomerOTOUniM customer){
        return customerService.saveCustomer(customer);
    }
}
