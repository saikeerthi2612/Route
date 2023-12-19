package com.example.RouteBooks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RouteBooks.Entity.Route;
import com.example.RouteBooks.Service.RouteService;

@RestController
public class RouteController {
	@Autowired
	private RouteService routeservice;
	
	 @PostMapping("/createroute")
		public Route saveRoute(@RequestBody Route route) {
			return routeservice.saveRoute(route);
			
		}
		@GetMapping("/getroute/{routeid}")
		public Route getById(@PathVariable Long routeid) {
			return routeservice.getById(routeid);
			
		}
		@GetMapping("/getallroutes")
		public  List<Route> getAllroutes(){
			return routeservice.getAllRoutes();
			
		}

		@PutMapping("/editroute/{routeid}")
		public Route updateDetails(@RequestBody Route route,@PathVariable Long routeid){
			return routeservice.updateDetails(route,routeid);
			
		}
		@DeleteMapping("/deleteroute/{routeid}")
		public String deleteRoute(@PathVariable Long routeid){
			return routeservice.deleteRoute(routeid);
			
		}

}
