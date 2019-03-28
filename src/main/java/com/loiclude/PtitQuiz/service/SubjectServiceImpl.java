package com.loiclude.PtitQuiz.service;

import com.loiclude.PtitQuiz.common.ResponseType;
import com.loiclude.PtitQuiz.common.RestCode;
import com.loiclude.PtitQuiz.repository.SubjectRepository;
import com.loiclude.PtitQuiz.response.PtitResponse;
import com.loiclude.PtitQuiz.service.subject.beans.SubjectMapperService;
import com.loiclude.PtitQuiz.service.subject.beans.SubjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectServiceImpl {

    @Autowired
    SubjectRepository subjectRepository;

//    @Autowired
//    SubjectMapperService mapperService;

    public PtitResponse getAll() {
        PtitResponse ptitResponse = new PtitResponse();
        ptitResponse.setType(ResponseType.ERROR.getValue());
        ptitResponse.setCode(RestCode.ERROR_INTERNAL_SERVER.getCode());
        ptitResponse.setMessage(RestCode.ERROR_INTERNAL_SERVER.getDescription());

        try {
            List<SubjectResponse> subjectResponses =  subjectRepository.findAll().stream().map(x -> {
                SubjectResponse response = mapperService.map(x);
                return response;
            }).collect(Collectors.toList());
            ptitResponse.setType(ResponseType.INFO.getValue());
            ptitResponse.setCode(RestCode.SUCCESS.getCode());
            ptitResponse.setMessage(RestCode.SUCCESS.getDescription());
            ptitResponse.setData(subjectResponses);
            return ptitResponse;
        } catch (Exception e) {

        }
        return ptitResponse;
    }
}
