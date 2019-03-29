package com.loiclude.PtitQuiz.service.subject;

import com.loiclude.PtitQuiz.model.Subject;
import com.loiclude.PtitQuiz.service.subject.beans.SubjectResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface SubjectMapperService {
    SubjectResponse map(Subject subject);
}
