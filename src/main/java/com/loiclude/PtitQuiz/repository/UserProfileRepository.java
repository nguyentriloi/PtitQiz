package com.loiclude.PtitQuiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loiclude.PtitQuiz.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{
	@Query("FROM UserProfile u WHERE u.maSv =:maSv")
	List<UserProfile> getAllByMaSV(@Param("maSv") String maSv);
}
