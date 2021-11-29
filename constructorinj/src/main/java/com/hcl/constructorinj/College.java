package com.hcl.constructorinj;

public class College 
{
	private String collegeName;
	private int collegeCode;
	private Rank rank;
	public College(String collegeName, int collegeCode, Rank rank) {
		super();
		this.collegeName = collegeName;
		this.collegeCode = collegeCode;
		this.rank=rank;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeCode=" + collegeCode + ", rank=" + rank + "]";
	}
	
}
