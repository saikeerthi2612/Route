package com.example.RouteBooks.Service;

import java.util.List;

import com.example.RouteBooks.Entity.Route;

public interface RouteService {
	 public Route saveRoute(Route route);
	 public Route getById(Long routeid);
	 public List<Route> getAllRoutes();
	 public Route updateDetails(Route route,Long routeid);
	 public String deleteRoute(Long routeid);

}
