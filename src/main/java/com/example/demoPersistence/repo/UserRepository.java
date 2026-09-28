package com.example.demoPersistence.repo;

import com.example.demoPersistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
