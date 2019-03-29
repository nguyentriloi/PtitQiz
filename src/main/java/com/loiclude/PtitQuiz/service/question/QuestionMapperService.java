package com.loiclude.PtitQuiz.service.question;

import com.loiclude.PtitQuiz.model.Question;
import com.loiclude.PtitQuiz.service.question.beans.QuestionResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionMapperService {
    QuestionResponse map(Question question);
}
