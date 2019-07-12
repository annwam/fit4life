package com.example.ann.fit4life.data;

import com.example.ann.fit4life.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
//@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

}
