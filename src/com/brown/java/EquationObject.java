package com.brown.java;

public class EquationObject {
	
	private String equName=null;
	private String[] equVariables=null;
	private String[] equLogic=null;

	public EquationObject(String equName,String[] equVariables, String[] equLogic ){
		this.equName = equName;
		this.equVariables=equVariables;
		this.equLogic=equLogic;
		
		
	}
	
	
	public String getEquName(){
		return equName;
	}
	
	public String[] getEquVars(){
		return equVariables;
	}
	public String[] getequLogic(){
		return equLogic;
	}
	
	

}
