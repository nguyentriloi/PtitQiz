package com.loiclude.PtitQuiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loiclude.PtitQuiz.model.MonHoc;
import com.loiclude.PtitQuiz.model.UserProfile;

@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, Integer>{
//	
//	@Query("FROM MonHoc u WHERE u.id =:idMonHoc")
//	List<MonHoc> getAllByMaSV(@Param("idMonHoc") String idMonHoc);
}
