package com.example.RouteBooks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RouteBooks.Entity.Favourite;

@Repository
public interface FavouriteRepo extends JpaRepository<Favourite,Long>{

}
