package com.loiclude.PtitQuiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loiclude.PtitQuiz.model.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer>{

	@Query("FROM History h WHERE h.idProfileUser =:idProfileUser")
	List<History> getByIdProfile(@Param("idProfileUser") Integer idProfileUser);
	
}
