package com.hotel.HotelRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hotel.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
