package com.userService.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userService.Entity.Hotel;
import com.userService.Entity.Rating;
import com.userService.Entity.User;
import com.userService.Exception.ResourceNotFoundException;
import com.userService.ExternalService.HotelService;
import com.userService.Repository.UserRepository;
import com.userService.Service.UserService;

import ch.qos.logback.classic.Logger;


@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepository  userRepository ;
	
    @Autowired
	RestTemplate restTemplate;
   
    @Autowired
    private HotelService hotelService;
    
	private Logger logger =  (Logger) LoggerFactory.getLogger(UserService.class);

	@Override	
	public User saveUser(User user) {
		
		//generate unique userid
		
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		//implements RATING SERVICE CALL: USING REST TEMPLATE
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("Use with given id is not found on server !! :"+ userId));
	   
		//fetch rating of the above user from the RATING SERVICE
		//http://localhost:8083/ratings/users/c85cb4b3-a807-4142-8ec2-85061576a7eb
		Rating[] ratingsOfUser =  restTemplate.getForObject("http://RATING-SERVICE/ratings/users/"+ user.getUserId(), Rating[].class);
		
		logger.info("{}",ratingsOfUser);
		
		List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();
		
		List<Rating> ratingList = ratings.stream().map(rating -> {
			//api call to hotel service to get the hotel 
			//http://localhost:8082/hotels/
			
			//ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+ rating.getHotelId(), Hotel.class);
			//Hotel hotel = forEntity.getBody();
			//logger.info("response status code: {}", forEntity.getStatusCode());
			
			//use FeignClient
			
			Hotel hotel = hotelService.getHotel(rating.getHotelId());
			//set the hotel to rating
			rating.setHotel(hotel);
			return rating;
		}).collect(Collectors.toList());
		
		user.setRatings(ratingList);
		
		
		return user;
		
	}

	@Override
	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
