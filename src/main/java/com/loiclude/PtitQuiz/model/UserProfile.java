package com.loiclude.PtitQuiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile")
public class UserProfile {

	 @Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "ma_sv")
	    private String maSv;

	    @Column(name = "diachi")
	    private String diachi;
	    
	    @Column(name = "sdt")
	    private String sdt;
	    
	    @Column(name = "khoa")
	    private String khoa;
	    
	    @Column(name = "truong")
	    private String truong;

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

		public String getMaSV() {
			return maSv;
		}

		public void setMaSV(String maSV) {
			this.maSv = maSV;
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
	    
}
