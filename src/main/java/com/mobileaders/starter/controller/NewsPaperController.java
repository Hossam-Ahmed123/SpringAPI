package com.mobileaders.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobileaders.starter.entities.Newspaper;
import com.mobileaders.starter.entities.dto.TagsNewsModel;
import com.mobileaders.starter.errors.ResourceNotFoundException;
import com.mobileaders.starter.services.NewsPaperService;

@RestController

public class NewsPaperController {
	@Autowired
	private NewsPaperService newsService;

//	localhost:8081/myapp/getAllNews
	@RequestMapping("/getAllNews")
	public List<Newspaper> getAllNews() {

		return newsService.allnews();

	}

	
	//localhost:8081/myapp/newsbytags
//	[
//
//	 {
//	"tagId":252
//
//	 },
//	 
//	 {"tagId":253}
//
//	]
 	@RequestMapping(value = "/newsbytags", method = RequestMethod.POST)
	public List<Newspaper> byTags(@RequestBody List<TagsNewsModel> tagsIds) {

		return newsService.allNewsbyTags(tagsIds);

	}
 //	localhost:8081/myapp/allnewsForUser/1
	@RequestMapping(path = "/allnewsForUser/{userid}", method = RequestMethod.GET)
	public List<Newspaper> getAllfavoarateUser(@PathVariable int userid) {
		return newsService.allNewsbyUser(userid);
	}

}
