package com.brown.java;

public class EquationObject {
	
	private String equName=null;
	private String[] equVarsUpper=null;
	private String[] equVarsLower=null;
	private String[] equLogicUpper=null;
	private String[] equLogicLower=null;
	
	public EquationObject(String equName,String[] equVarsUpper, String[] equVarsLower,String[] equLogicUpper,String[] equLogicLower ){
		this.equName = equName;
		this.equVarsUpper=equVarsUpper;
		this.equVarsLower=equVarsLower;
		this.equLogicUpper=equLogicUpper;
		this.equLogicLower=equLogicLower;
		
	}
	
	
	public String getEquName(){
		return equName;
	}
	
	public String[] getEquVarsUpper(){
		return equVarsUpper;
	}
	public String[] getEquVarsLower(){
		return equVarsLower;
	}
	public String[] getEquLogicUpper(){
		return equLogicUpper;
	}
	public String[] getEquLogicLower(){
		return equLogicLower;
	}
	

}
