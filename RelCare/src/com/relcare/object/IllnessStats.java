package com.relcare.object;

public class IllnessStats {

	String state;
	String illnessName;
	int below6;
	int six12;
	int thirteen19;
	int twenty40;
	int above40;
	
	public IllnessStats(String state, String illnessName, int below6,int six,int thir,int twen, int abv) {
		super();
		this.state = state;
		this.illnessName = illnessName;
		this.below6 = below6;
		this.six12 = six;
		this.thirteen19 = thir;
		this.twenty40 = twen;
		this.above40 = abv;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIllnessName() {
		return illnessName;
	}

	public void setIllnessName(String illnessName) {
		this.illnessName = illnessName;
	}

	
}
