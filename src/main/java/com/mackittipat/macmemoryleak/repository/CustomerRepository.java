package com.mackittipat.macmemoryleak.repository;

import com.mackittipat.macmemoryleak.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByIdIn(List<Integer> idList);

}
