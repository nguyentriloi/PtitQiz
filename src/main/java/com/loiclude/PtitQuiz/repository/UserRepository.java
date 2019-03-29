package com.loiclude.PtitQuiz.repository;

import com.loiclude.PtitQuiz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByMa(String ma);
}
