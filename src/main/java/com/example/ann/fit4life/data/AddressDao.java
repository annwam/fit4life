package com.example.ann.fit4life.data;

import com.example.ann.fit4life.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends CrudRepository<Address,Integer> {
}
