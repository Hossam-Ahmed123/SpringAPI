package com.mobileaders.starter.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileaders.starter.entities.Follow;
import com.mobileaders.starter.entities.Newspaper;
import com.mobileaders.starter.entities.TagesNews;
import com.mobileaders.starter.entities.dto.TagsNewsModel;
import com.mobileaders.starter.errors.ResourceNotFoundException;
import com.mobileaders.starter.repositories.FollowRepository;
import com.mobileaders.starter.repositories.NewsPaperRepository;
import com.mobileaders.starter.repositories.TagsNewsRepository;

@Service
public class NewsPaperService {
	@Autowired
	private NewsPaperRepository repository;

	@Autowired
	private FollowRepository followRepository;

	@Autowired
	private TagsNewsRepository tagsNewsRepository;

	public List<Newspaper> allnews() {

		List<Newspaper> newsList = new ArrayList<>();

		repository.findAll().forEach(newsList::add);

		return newsList;

	}

	public List<Newspaper> allNewsbyUser(int userId) {

		List<Follow> fList = new ArrayList<>();

		followRepository.findAllByuserId(userId).forEach(fList::add);
		Collection<Integer> idlist = new ArrayList<Integer>();
		for (Follow follow : fList) {
			idlist.add(follow.getNewspaperId());
		}

		List<Newspaper> news = new ArrayList<Newspaper>();

		repository.findUserByNameList(idlist).forEach(news::add);

		return news;

	}

	public List<Newspaper> allNewsbyTags(List<TagsNewsModel> tagsIds) {
		List<TagesNews> tagesNewslist = new ArrayList<TagesNews>();
		for (TagsNewsModel tagsIdss : tagsIds) {

			tagsNewsRepository.findAllBytagId(tagsIdss.getTagId()).forEach(tagesNewslist::add);

		}
		Collection<Integer> newsIdlist = new ArrayList<Integer>();
		for (TagesNews tagesNews : tagesNewslist) {
			newsIdlist.add(tagesNews.getNewsId());
		}

		List<Newspaper> news = new ArrayList<Newspaper>();

		repository.findUserByNameList(newsIdlist).forEach(news::add);

		return news;
	}

}
