package com.mobileaders.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileaders.starter.entities.Tags;
import com.mobileaders.starter.errors.ResourceNotFoundException;
import com.mobileaders.starter.services.TagsService;

@RestController
public class TagsController {
	@Autowired
	private TagsService tagsService;

//	localhost:8081/myapp/allTags

	@RequestMapping("/allTags")
	public List<Tags> getAllTags() {

		return tagsService.allTags();

	}

//	localhost:8081/myapp/allTagsForUser/1
	@RequestMapping(path = "/allTagsForUser/{userid}", method = RequestMethod.POST)
	public List<Tags> getAllfavoarateUser(@PathVariable int userid) {
		return tagsService.allTagsbyUser(userid);
	}

}
