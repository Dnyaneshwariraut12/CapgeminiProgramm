package com.hotel.HotelServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hotel.Entity.Hotel;
import com.hotel.Exceptions.ResourceNotFoundException;
import com.hotel.HotelRepository.HotelRepository;
import com.hotel.Services.HotelService;

@Service
public class HotelServiceImpl  implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	
	@Override
	public Hotel create(Hotel hotel) {
		
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
	
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id not found !!"));
	}
	

}
