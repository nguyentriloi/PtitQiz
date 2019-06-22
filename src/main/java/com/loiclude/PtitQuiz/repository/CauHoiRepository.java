package com.loiclude.PtitQuiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loiclude.PtitQuiz.model.CauHoi;

@Repository
public interface CauHoiRepository extends JpaRepository<CauHoi, Integer>{
	
	@Query("FROM CauHoi c WHERE c.idMonhoc =:idMonhoc")
	List<CauHoi> findAllByIdMonHoc(@Param("idMonhoc") Integer idMonhoc);
}
