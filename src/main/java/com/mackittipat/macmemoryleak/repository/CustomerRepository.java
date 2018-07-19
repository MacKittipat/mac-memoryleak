package com.mackittipat.macmemoryleak.repository;

import com.mackittipat.macmemoryleak.domain.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByIdIn(List<Integer> idList);

    @Query("SELECT e FROM #{#entityName} e where e.id in (?1)")
    List<Customer> find(List<Integer> idList);

}
