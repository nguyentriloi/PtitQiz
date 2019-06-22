package com.loiclude.PtitQuiz.model;

import java.util.Date;
public class TargetDTO {
	
    private Integer id;

    private Date date;

    private Integer idMonhoc;

    private Integer soccer;
    
    private String maSv;

    private String nameLesson;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getIdMonhoc() {
		return idMonhoc;
	}

	public void setIdMonhoc(Integer idMonhoc) {
		this.idMonhoc = idMonhoc;
	}

	public Integer getSoccer() {
		return soccer;
	}

	public void setSoccer(Integer soccer) {
		this.soccer = soccer;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public String getNameLesson() {
		return nameLesson;
	}

	public void setNameLesson(String nameLesson) {
		this.nameLesson = nameLesson;
	}
    
    
}
