package com.example.RouteBooks.Entity;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userid;
	private String name;
	private String email;
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_userid",referencedColumnName="userid")
	private List<Route> route;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_userid",referencedColumnName="userid")
	private List<Favourite> favourite;
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Route> getRoute() {
		return route;
	}
	public void setRoute(List<Route> route) {
		this.route = route;
	}
	public List<Favourite> getFavourite() {
		return favourite;
	}
	public void setFavourite(List<Favourite> favourite) {
		this.favourite = favourite;
	}
	
	
	
	

}
