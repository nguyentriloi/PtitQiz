package com.loiclude.PtitQuiz.service.subject.beans;

import com.loiclude.PtitQuiz.model.Subject;
import com.loiclude.PtitQuiz.response.PtitResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapperService {
    SubjectResponse map(Subject subject);
}
