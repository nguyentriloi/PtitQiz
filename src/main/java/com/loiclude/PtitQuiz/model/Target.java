package com.loiclude.PtitQuiz.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "target")
public class Target {
		@Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "date")
	    private Date date;

	    @Column(name = "id_monhoc")
	    private Integer idMonhoc;

	    @Column(name = "soccer")
	    private Integer soccer;
	    
	    @Column(name = "ma_sv")
	    private String maSv;

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


	    
}
