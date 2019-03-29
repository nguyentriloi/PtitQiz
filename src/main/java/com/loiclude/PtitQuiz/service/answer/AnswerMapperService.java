package com.loiclude.PtitQuiz.service.answer;

import com.loiclude.PtitQuiz.model.Answer;
import com.loiclude.PtitQuiz.service.answer.beans.AnswerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnswerMapperService {
    AnswerResponse map(Answer answer);
}
