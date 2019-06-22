package com.loiclude.PtitQuiz.model;

import java.util.List;

public class TargetRes {
	private List<TargetDTO> target;

	public TargetRes(List<TargetDTO> target) {
		super();
		this.target = target;
	}

	public List<TargetDTO> getTarget() {
		return target;
	}

	public void setTarget(List<TargetDTO> target) {
		this.target = target;
	}
	
}
