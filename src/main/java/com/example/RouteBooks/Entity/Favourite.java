package com.example.RouteBooks.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="favourite")
public class Favourite {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long favouriteid;
	

}
