package com.io.api;

import com.io.domain.Customer;
import com.io.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @DeleteMapping("/customer/{custId}")
    public String deleteCustomer(@PathVariable("custId") Integer custId){
        customerService.delete(custId);
        return "Deleted customer Id  : "+custId;
    }
    @PutMapping("/updateCustomer")
    public Customer udpate(@RequestBody Customer customer){
        return customerService.saveOrUpdate(customer);
    }
  @GetMapping("/customer/{custId}")
  public Optional<Customer> getCustomer(@PathVariable("custId") Integer custId){
        return customerService.getCustomer(custId);
  }

    @GetMapping("/Customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
}
