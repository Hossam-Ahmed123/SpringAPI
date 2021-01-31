package com.mobileaders.starter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileaders.starter.entities.Favorites;
 @Repository

public interface FavoritesRepository extends JpaRepository<Favorites, Long>{

	List<Favorites> findAllByuserId(int userId);

	
}
