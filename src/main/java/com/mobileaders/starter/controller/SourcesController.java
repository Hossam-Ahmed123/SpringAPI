package com.mobileaders.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileaders.starter.entities.Sources;
import com.mobileaders.starter.errors.ResourceNotFoundException;
import com.mobileaders.starter.services.SourceService;

@RestController

public class SourcesController {

	@Autowired
	private SourceService sourceService;

//	localhost:8081/myapp/allSources
 	@RequestMapping("/allSources")
	public List<Sources> getAllNews() {

		return sourceService.allSources();

	}

}
