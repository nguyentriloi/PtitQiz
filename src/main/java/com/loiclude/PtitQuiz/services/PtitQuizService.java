package com.loiclude.PtitQuiz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loiclude.PtitQuiz.model.CauHoi;
import com.loiclude.PtitQuiz.model.CauHoiRes;
import com.loiclude.PtitQuiz.model.History;
import com.loiclude.PtitQuiz.model.HistoryDTO;
import com.loiclude.PtitQuiz.model.MonHoc;
import com.loiclude.PtitQuiz.model.ProfileDTO;
import com.loiclude.PtitQuiz.model.Target;
import com.loiclude.PtitQuiz.model.TargetDTO;
import com.loiclude.PtitQuiz.model.UserProfile;
import com.loiclude.PtitQuiz.repository.CauHoiRepository;
import com.loiclude.PtitQuiz.repository.HistoryRepository;
import com.loiclude.PtitQuiz.repository.MonHocRepository;
import com.loiclude.PtitQuiz.repository.TargetRepository;
import com.loiclude.PtitQuiz.repository.UserProfileRepository;

@Service
public class PtitQuizService {
	@Autowired
	CauHoiRepository cauHoiRepository;
	
	@Autowired
	MonHocRepository hocRepository;
	
	@Autowired
	UserProfileRepository profileRepository;
	
	@Autowired
	TargetRepository repository;
	
	@Autowired
	HistoryRepository historyRepository;
	
	public CauHoiRes getAllByCauHoi(Integer idMonhoc){
		List<CauHoi> cauHois = cauHoiRepository.findAllByIdMonHoc(idMonhoc);
		List<String> questions = new ArrayList<>();
		List<String> answers = new ArrayList<>();
		List<String> correctAnswers = new ArrayList<>();
		cauHois.forEach(x->{
			questions.add(x.getQuestions());
			correctAnswers.add(x.getCorrectAnswers());
			answers.add(x.getAnswers());
		});
		
		return new CauHoiRes(questions,answers,correctAnswers);
	}

	public List<MonHoc> getAll() {
		return hocRepository.findAll();
	}
	public ProfileDTO getAllByMaSV(String maSV) {
		List<UserProfile> getAllUserProfile = profileRepository.getAllByMaSV(maSV);
		ProfileDTO profileDTO = new ProfileDTO();
		List<HistoryDTO> historyDTOs = new ArrayList<>();
		getAllUserProfile.forEach(x->{
			profileDTO.setId(x.getId());
			profileDTO.setDiachi(x.getDiachi());
			profileDTO.setKhoa(x.getKhoa());
			profileDTO.setMaSv(x.getMaSV());
			profileDTO.setSdt(x.getSdt());
			profileDTO.setName(x.getName());
			profileDTO.setTruong(x.getTruong());
			List<History> histories = historyRepository.getByIdProfile(x.getId());
			System.out.println(histories);
			histories.forEach(y->{
				MonHoc monHoc = hocRepository.getOne(y.getIdMonhoc());
				HistoryDTO historyDTO = new HistoryDTO();
				historyDTO.setIdMonhoc(y.getIdMonhoc());
				historyDTO.setMaSv(x.getMaSV());
				historyDTO.setNameLesson(monHoc.getNameLesson());
				historyDTO.setSoccer(y.getSoccer());
				historyDTOs.add(historyDTO);
			});
			profileDTO.setHistories(historyDTOs);
		});
		return profileDTO;
	}
	public List<TargetDTO> getTargetByMaSV(String maSV) {
		if(maSV != null) {
			List<Target> targets= repository.getTargetByMaSV(maSV);
			List<TargetDTO> targetDTOs = new ArrayList<>();
			targets.forEach(x->{
				TargetDTO targetDTO = new TargetDTO();
				targetDTO.setDate(x.getDate());
				targetDTO.setId(x.getId());
				targetDTO.setNameLesson(hocRepository.getOne(x.getIdMonhoc()).getNameLesson());
				targetDTO.setSoccer(x.getSoccer());
				targetDTO.setMaSv(x.getMaSv());
				targetDTO.setIdMonhoc(x.getIdMonhoc());
				targetDTOs.add(targetDTO);
			});
			return targetDTOs;
		}
		return null;
	}

	public void saveHistory(HistoryDTO historyDTO) {
		History history = new History();
		history.setIdMonhoc(historyDTO.getIdMonhoc());
		List<UserProfile> profile = profileRepository.getAllByMaSV(historyDTO.getMaSv());
		history.setIdProfileUser(profile.get(0).getId());
		history.setSoccer(historyDTO.getSoccer());
		historyRepository.save(history);
	}

	public void saveTarget(TargetDTO targetDTO) {
		// TODO Auto-generated method stub
		Target target = new Target();
		target.setSoccer(targetDTO.getSoccer());
		target.setDate(targetDTO.getDate());
		target.setIdMonhoc(targetDTO.getIdMonhoc());
		target.setMaSv(targetDTO.getMaSv());
		repository.save(target);
	}
}
