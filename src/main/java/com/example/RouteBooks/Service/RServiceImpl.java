package com.example.RouteBooks.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RouteBooks.Entity.Route;
import com.example.RouteBooks.Repository.RouteRepo;

@Service
public class RServiceImpl implements RouteService {
	
	@Autowired
	private RouteRepo routerepo;

	@Override
	public Route saveRoute(Route route) {
		// TODO Auto-generated method stub
		return routerepo.save(route);
	}

	@Override
	public Route getById(Long routeid) {
		// TODO Auto-generated method stub
		return routerepo.findById(routeid).get();
	}

	@Override
	public List<Route> getAllRoutes() {
		// TODO Auto-generated method stub
		return routerepo.findAll();
	}

	@Override
	public Route updateDetails(Route route, Long routeid) {
		// TODO Auto-generated method stub
		Route updateRoute=routerepo.findById(route.getRouteid()).orElse(null);
		if(updateRoute!=null) {
			updateRoute.setSource(route.getSource());
			updateRoute.setDescription(route.getDescription());
			updateRoute.setDestination(route.getDestination());
			
			routerepo.save(updateRoute);
			return updateRoute;
		}
		return null;
	}

	@Override
	public String deleteRoute(Long routeid) {
		// TODO Auto-generated method stub
		routerepo.deleteById(routeid);
		return "deleted route id is "+routeid;
	}

}
