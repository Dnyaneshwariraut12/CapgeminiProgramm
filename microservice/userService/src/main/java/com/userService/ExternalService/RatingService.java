package com.userService.ExternalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.service.annotation.PutExchange;

import com.userService.Entity.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
	
	//get
	
	//post
	@PostMapping("/ratings")
	public Rating creatRating(Rating values);
	
	//put
	@PutMapping("/ratings/{ratingId}")
	public Rating updateRating(@PathVariable("ratingId") String ratingId, Rating rating);
	
	//delete
	@DeleteMapping("/ratigs/{ratingId}")
	public void deleteRating(@PathVariable String ratingId);

}
