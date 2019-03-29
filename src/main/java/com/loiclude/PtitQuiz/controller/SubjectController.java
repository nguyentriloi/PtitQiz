package com.loiclude.PtitQuiz.controller;

import com.loiclude.PtitQuiz.response.PtitResponse;
import com.loiclude.PtitQuiz.service.subject.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping
    public PtitResponse getSubjects(){
        return subjectService.getAll();
    }
}
