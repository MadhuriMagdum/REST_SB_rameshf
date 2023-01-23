package com.pro.Reporitory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}