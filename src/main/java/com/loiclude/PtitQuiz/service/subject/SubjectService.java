package com.loiclude.PtitQuiz.service.subject;

import com.loiclude.PtitQuiz.common.ResponseType;
import com.loiclude.PtitQuiz.common.RestCode;
import com.loiclude.PtitQuiz.model.Answer;
import com.loiclude.PtitQuiz.model.Question;
import com.loiclude.PtitQuiz.repository.AnswerRepository;
import com.loiclude.PtitQuiz.repository.QuestionRepository;
import com.loiclude.PtitQuiz.repository.SubjectRepository;
import com.loiclude.PtitQuiz.response.PtitResponse;
import com.loiclude.PtitQuiz.service.answer.AnswerMapperService;
import com.loiclude.PtitQuiz.service.answer.beans.AnswerResponse;
import com.loiclude.PtitQuiz.service.question.QuestionMapperService;
import com.loiclude.PtitQuiz.service.question.beans.QuestionResponse;
import com.loiclude.PtitQuiz.service.subject.SubjectMapperService;
import com.loiclude.PtitQuiz.service.subject.beans.SubjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

//    @Autowired
//    SubjectMapperService subjectMapperService;

//    @Autowired
//    QuestionMapperService questionMapperService;
//
//    @Autowired
//    AnswerMapperService answerMapperService;

    public PtitResponse getAll() {
        PtitResponse ptitResponse = new PtitResponse();
        try {
            List<SubjectResponse> subjectResponses =  subjectRepository.findAll().stream().map(x -> {
                SubjectResponse response = new SubjectResponse();
                response.setId(x.getId());
                response.setName(x.getName());
                List<Question> questions = questionRepository.findQuestionsBySubjectIdl(x.getId());
                List<QuestionResponse> questionResponses = questions.stream().map(q -> {
                    QuestionResponse questionResponse = new QuestionResponse();
                    questionResponse.setId(q.getId());
                    questionResponse.setName(q.getName());
                    List<Answer> answers = answerRepository.findAnswersByQuestionId(q.getId());
                    List<AnswerResponse> answerResponses = answers.stream().map(a -> {
                        AnswerResponse answerResponse = new AnswerResponse();
                        answerResponse.setId(a.getId());
                        answerResponse.setName(a.getName());
                        return answerResponse;
                    }).collect(Collectors.toList());
                    questionResponse.setAnswers(answerResponses);
                    return questionResponse;
                }).collect(Collectors.toList());
                response.setQuestions(questionResponses);
                return response;
            }).collect(Collectors.toList());
            ptitResponse.setType(ResponseType.INFO.getValue());
            ptitResponse.setCode(RestCode.SUCCESS.getCode());
            ptitResponse.setMessage(RestCode.SUCCESS.getDescription());
            ptitResponse.setData(subjectResponses);
            return ptitResponse;
        } catch (Exception e) {
            //to do
        }
        return ptitResponse;
    }
}
