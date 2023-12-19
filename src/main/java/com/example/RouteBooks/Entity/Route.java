package com.example.RouteBooks.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="route")
public class Route {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long routeid;
	private String source;
	private String destination;
	private String description;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_routeid",referencedColumnName="routeid")
	private List<Favourite> favourite;
	
	public Long getRouteid() {
		return routeid;
	}
	public void setRouteid(Long routeid) {
		this.routeid = routeid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Favourite> getFavourite() {
		return favourite;
	}
	public void setFavourite(List<Favourite> favourite) {
		this.favourite = favourite;
	}
	
	

}
