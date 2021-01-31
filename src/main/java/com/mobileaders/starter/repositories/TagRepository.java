package com.mobileaders.starter.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mobileaders.starter.entities.Tags;


@Repository
public interface TagRepository extends JpaRepository<Tags, Long> {

	@Query(value = "SELECT t FROM Tags t WHERE t.tagid IN :ids")
	List<Tags> findUserByNameList(@Param("ids") Collection<Integer> ids);

}
