package com.loiclude.PtitQuiz.model;

import java.util.List;

public class MonHocReq {
	List<MonHoc> monhoc;

	public MonHocReq(List<MonHoc> monhoc) {
		super();
		this.monhoc = monhoc;
	}

	public List<MonHoc> getMonhoc() {
		return monhoc;
	}

	public void setMonhoc(List<MonHoc> monhoc) {
		this.monhoc = monhoc;
	}
	
} 
