package com.example.ann.fit4life.data;


import com.example.ann.fit4life.models.forms.ProfilePost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PostDao extends CrudRepository<ProfilePost, Integer> {
}
