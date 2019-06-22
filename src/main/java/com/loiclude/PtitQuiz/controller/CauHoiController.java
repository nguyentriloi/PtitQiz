package com.loiclude.PtitQuiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loiclude.PtitQuiz.model.CauHoi;
import com.loiclude.PtitQuiz.service.question.QuestionService;

@RestController
@RequestMapping("/cauhoi")
public class CauHoiController {
	
//	@Autowired
//	QuestionService questionService;
//	@GetMapping()
//	public List<CauHoi> getAll(@RequestParam("idMonhoc") Integer idMonhoc){
//		return questionService.getAllByMon(idMonhoc);
//	}
}
