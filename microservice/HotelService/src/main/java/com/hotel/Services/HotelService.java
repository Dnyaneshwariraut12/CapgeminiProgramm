package com.hotel.Services;

import java.util.List;

import com.hotel.Entity.Hotel;

public interface HotelService {

	//create
	Hotel create(Hotel hotel);
	
	//get all
	List<Hotel> getAll();
	
	//get single 
	
	Hotel get(String id);
}
