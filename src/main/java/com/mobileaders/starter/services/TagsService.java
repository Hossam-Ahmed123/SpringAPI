package com.mobileaders.starter.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileaders.starter.entities.Favorites;
import com.mobileaders.starter.entities.Tags;
import com.mobileaders.starter.repositories.FavoritesRepository;
import com.mobileaders.starter.repositories.TagRepository;

@Service
public class TagsService {
	@Autowired
	private TagRepository repository;
	@Autowired
	FavoritesRepository fr;

	public List<Tags> allTags() {

		List<Tags> tagList = new ArrayList<>();

		repository.findAll().forEach(tagList::add);

		return tagList;

	}

	public List<Tags> allTagsbyUser(int userId) {

		List<Favorites> fList = new ArrayList<>();

		fr.findAllByuserId(userId).forEach(fList::add);
		Collection<Integer> idlist = new ArrayList<Integer>();
		for (Favorites favorites : fList) {
			idlist.add(favorites.getTagID());
		}

		List<Tags> ftages = new ArrayList<Tags>();

		repository.findUserByNameList(idlist).forEach(ftages::add);

		return ftages;

	}

}