package com.bfbrug.spring6restmvc.mappers;

import com.bfbrug.spring6restmvc.entities.Customer;
import com.bfbrug.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
