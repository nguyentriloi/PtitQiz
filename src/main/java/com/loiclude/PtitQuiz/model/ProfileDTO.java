package com.loiclude.PtitQuiz.model;

import java.util.List;

import javax.persistence.Column;

public class ProfileDTO {
		private Integer id;

	    private String name;

	    private String maSv;

	    private String diachi;
	    
	    private String sdt;
	    
	    private String khoa;
	    
	    private String truong;
	    
	    private List<HistoryDTO> histories;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMaSv() {
			return maSv;
		}

		public void setMaSv(String maSv) {
			this.maSv = maSv;
		}

		public String getDiachi() {
			return diachi;
		}

		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}

		public String getSdt() {
			return sdt;
		}

		public void setSdt(String sdt) {
			this.sdt = sdt;
		}

		public String getKhoa() {
			return khoa;
		}

		public void setKhoa(String khoa) {
			this.khoa = khoa;
		}

		public String getTruong() {
			return truong;
		}

		public void setTruong(String truong) {
			this.truong = truong;
		}

		public List<HistoryDTO> getHistories() {
			return histories;
		}

		public void setHistories(List<HistoryDTO> histories) {
			this.histories = histories;
		}
	    
	    
}
