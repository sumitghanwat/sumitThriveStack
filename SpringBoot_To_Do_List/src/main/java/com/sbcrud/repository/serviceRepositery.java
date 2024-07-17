package com.sbcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbcrud.model.User;
@Repository
public interface serviceRepositery extends CrudRepository<User, Integer>{

}
