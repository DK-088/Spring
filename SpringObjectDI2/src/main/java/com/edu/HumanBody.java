package com.edu;

public class HumanBody {
	
	private Heart heart;
	
	

	public HumanBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public HumanBody(Heart heart) {
		super();
		this.heart = heart;
	}
	
	public void Humanlive() {
		if(heart != null) {
			heart.HumanLive();
		}
	}
	
	

}
