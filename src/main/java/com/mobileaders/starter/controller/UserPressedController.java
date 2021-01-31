package com.mobileaders.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileaders.starter.entities.dto.UserFavourts;
import com.mobileaders.starter.entities.dto.UserFollow;
import com.mobileaders.starter.entities.dto.UserLike;
import com.mobileaders.starter.services.UserPressedOpration;

@RestController
@RequestMapping("/userspress")
public class UserPressedController {

	@Autowired
	private UserPressedOpration userService;

//	localhost:8081/myapp/userspress/pressLike

//	{
//		 
//        "userId": 1,"articleId":834
//  }

	@PostMapping
	@RequestMapping("/pressLike") // send userId and articleId;
	public ApiResponse like(@RequestBody UserLike users) {
		return userService.prssLike(users);
	}

//	localhost:8081/myapp/userspress/pressfollow

//	{
//		 
//        "userId": 1,"newsId":23
//  }

	@PostMapping
	@RequestMapping("/pressfollow") // send userId and newsPaperID;
	public ApiResponse follow(@RequestBody UserFollow users) {
		return userService.prssFollow(users);
	}

//	localhost:8081/myapp/userspress/pressfavourte
//	{
//		 
//        "userId": 1,"tagId":252
//  }

	@PostMapping
	@RequestMapping("/pressfavourte") // send userId and tagId;

	public ApiResponse favorate(@RequestBody UserFavourts users) {
		return userService.prssFavorites(users);
	}

}
