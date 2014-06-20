package com.brown.java;

import java.util.LinkedList;
import java.util.Queue;

public class ladderLogicUtil {
	

	
	public static Queue<String> getEquationName(String line, Queue<String> equationName ){
		
		String[] size = line.split("\\s+");
		
		for(int i=size.length-1; i>=0;i--){						
			
			if(size[i].toString().isEmpty())continue;
			
			equationName.add(size[i].toString());							
		}
		
		return equationName;
	}
	
	public static Queue<String> getRestOfVars(String line, Queue<String> equationVariables){
		
		String size[] = line.split("\\s");
			
		for(int i=0; i<size.length;i++){
				
			if(size[i].toString().isEmpty() || size[i].toString().contains("|"))continue;
				
				equationVariables.add(size[i].toString());							
			}
		
		return equationVariables;
	}
	
	public static EquationObject getEquationObj(String name,Queue<String> equationVariables,Queue<String> equationLogic ){
		
		String[] equVars = new String[equationVariables.size()];
		int i=0;
		while(equationVariables.peek()!=null){
			
			equVars[i]=equationVariables.poll();
			i++;
		}
		
		return new EquationObject(name, equVars,  null);
		
	}
	

}
