package com.mobileaders.starter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileaders.starter.entities.Sources;
import com.mobileaders.starter.repositories.SourceRepository;

@Service
public class SourceService {

	@Autowired
	private SourceRepository repository;

	public List<Sources> allSources() {

		List<Sources> sourceList = new ArrayList<>();

		repository.findAll().forEach(sourceList::add);

		return sourceList;

	}
}