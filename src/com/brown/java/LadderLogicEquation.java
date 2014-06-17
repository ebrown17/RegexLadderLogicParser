package com.brown.java;

import java.util.ArrayList;

public class LadderLogicEquation {
	
	
	static String equation="";
	public static boolean isEquation(String line){
		
		return	!equation.equals(line.replace(line.substring(0,line.indexOf(":")+2),""));		
		
	}
	public static String getEquation(String line){
		
		return	line.replace(line.substring(0,line.indexOf(":")+2),"");		
		
	}
	
	public static void setEquation(String line){
		
		equation=line.replace(line.substring(0,line.indexOf(":")+2),"");		
		
	}
	
	public static void unsetEquation(){
		equation = "";
	}

}
