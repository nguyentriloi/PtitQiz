package com.loiclude.PtitQuiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history")
public class History {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_monhoc")
    private Integer idMonhoc;

    @Column(name = "soccer")
    private Integer soccer;
    
    @Column(name = "id_profile_user")
    private Integer idProfileUser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getIdProfileUser() {
		return idProfileUser;
	}

	public void setIdProfileUser(Integer idProfileUser) {
		this.idProfileUser = idProfileUser;
	}
    
}
