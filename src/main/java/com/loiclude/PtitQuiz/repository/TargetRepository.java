package com.loiclude.PtitQuiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loiclude.PtitQuiz.model.Target;

@Repository
public interface TargetRepository extends JpaRepository<Target, Integer>{
	@Query("FROM Target u WHERE u.maSv =:maSv")
	List<Target> getTargetByMaSV(@Param("maSv") String maSv);
}
