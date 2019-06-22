package com.loiclude.PtitQuiz.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.loiclude.PtitQuiz.model.CauHoi;
import com.loiclude.PtitQuiz.model.CauHoiRes;
import com.loiclude.PtitQuiz.model.HistoryDTO;
import com.loiclude.PtitQuiz.model.MonHoc;
import com.loiclude.PtitQuiz.model.MonHocReq;
import com.loiclude.PtitQuiz.model.ProfileDTO;
import com.loiclude.PtitQuiz.model.TargetDTO;
import com.loiclude.PtitQuiz.model.TargetRes;
import com.loiclude.PtitQuiz.model.UserProfile;
import com.loiclude.PtitQuiz.services.PtitQuizService;

import net.minidev.json.JSONObject;

@RestController
@CrossOrigin(origins="*")
public class PtitQuizController {
	
	@Autowired
	PtitQuizService ptitQuizService;
	
	@GetMapping("/cauhoi/{idMonhoc}")
	public CauHoiRes getAll(@PathVariable("idMonhoc") Integer idMonhoc){
		return ptitQuizService.getAllByCauHoi(idMonhoc);
	}
	
	@GetMapping("/monhoc")
	public MonHocReq getAll(){
		return new MonHocReq(ptitQuizService.getAll());
	}
	
	@GetMapping("/profile/{maSv}")
	@CrossOrigin(origins="*")
	public ProfileDTO getAllByMaSV(@PathVariable("maSv") String maSv){
		return ptitQuizService.getAllByMaSV(maSv);
	}
	
	@GetMapping("/target/{maSv}")
	public TargetRes getTargetByMaSv(@PathVariable("maSv") String maSv){
		return new TargetRes(ptitQuizService.getTargetByMaSV(maSv));
	}
	
	@PostMapping("/history")
	public void saveHistory(@RequestBody HistoryDTO historyDTO) {
		ptitQuizService.saveHistory(historyDTO);
	}
	@PostMapping("/targetPost")
	public void saveTarget(@RequestBody TargetDTO targetDTO) {
		ptitQuizService.saveTarget(targetDTO);
	}
}
