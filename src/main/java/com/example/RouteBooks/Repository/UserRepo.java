package com.example.RouteBooks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RouteBooks.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
