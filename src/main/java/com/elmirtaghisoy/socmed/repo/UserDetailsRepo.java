package com.elmirtaghisoy.socmed.repo;

import com.elmirtaghisoy.socmed.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}