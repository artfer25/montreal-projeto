package com.example.montreal.project.repository;

import com.example.montreal.project.entity.UserLogin;
import com.example.montreal.project.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
}
