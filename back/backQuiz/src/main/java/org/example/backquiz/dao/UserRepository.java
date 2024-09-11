package org.example.backquiz.dao;

import org.example.backquiz.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
