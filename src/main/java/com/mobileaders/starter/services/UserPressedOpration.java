package com.mobileaders.starter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileaders.starter.controller.ApiResponse;
import com.mobileaders.starter.entities.Favorites;
import com.mobileaders.starter.entities.Follow;
import com.mobileaders.starter.entities.Likes;
import com.mobileaders.starter.entities.dto.UserFavourts;
import com.mobileaders.starter.entities.dto.UserFollow;
import com.mobileaders.starter.entities.dto.UserLike;
import com.mobileaders.starter.repositories.FavoritesRepository;
import com.mobileaders.starter.repositories.FollowRepository;
import com.mobileaders.starter.repositories.LikesRepository;

@Service
public class UserPressedOpration {

	@Autowired
	private LikesRepository likesRepository;
	@Autowired
	private FollowRepository followRepository;
	@Autowired
	private FavoritesRepository favoritesRepository;

	public ApiResponse prssLike(UserLike user) {
		ApiResponse api = null;

		if (user != null) {
			Likes likes = new Likes();
			likes.setArticleId(user.getArticleId());
			likes.setUserId(user.getUserId());

			likesRepository.save(likes);

			api = new ApiResponse(200, "success", likes);
		}

		return api;
	}

	public ApiResponse prssFollow(UserFollow user) {

		ApiResponse api = null;
		if (user != null) {

			Follow follow = new Follow();
			follow.setNewspaperId(user.getNewsId());
			follow.setUserId(user.getUserId());

			followRepository.save(follow);
			api = new ApiResponse(200, "success", follow);
		}

		return api;

	}

	public ApiResponse prssFavorites(UserFavourts user) {

		ApiResponse api = null;

		if (user != null) {
			Favorites favorites = new Favorites();
			favorites.setTagID(user.getTagId());

			favorites.setUserId(user.getUserId());

			favoritesRepository.save(favorites);
			api = new ApiResponse(200, "success", favorites);
		}

		return api;
	}

}
