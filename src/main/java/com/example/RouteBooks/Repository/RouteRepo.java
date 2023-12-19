package com.example.RouteBooks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RouteBooks.Entity.Route;

@Repository
public interface RouteRepo extends JpaRepository<Route,Long>{

}
