package com.brown.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	static Scanner scanner = null;
	static String filename = "ladderlogictext/equationZ";
	static Queue<String> equationVariables = new LinkedList<String>();

	static ArrayList<EquationObject> equObjList = new ArrayList<EquationObject>();
	static Pattern pEq = Pattern.compile("[^+()\n-]+[_a-zA-Z0-9].*");	
	
	static String line;
	
	public static void main(String[] args){
		
			try {
				 scanner = new Scanner(new File (filename));
			} catch (FileNotFoundException e) {
				System.out.println("file not found: " + filename);
				
			}
			
			scanner.useDelimiter(System.getProperty("line.separator"));
			
			
			while(scanner.hasNext()){
				
				line = scanner.next();				
				
				if(line.contains("Equation")|| line.trim().isEmpty()){
					continue;					
				}
			
				
				Matcher matcher = pEq.matcher(line);
				if(matcher.find()){
				
					equationVariables = ladderLogicUtil.getEquationName(line,equationVariables);
					String name = equationVariables.poll();
					Collections.reverse((List<?>) equationVariables);
					equationVariables.add("|");
					
					while(scanner.hasNext()){						
						line = scanner.next();
						matcher=pEq.matcher(line);
						
						if(line.contains("Equation")|| line.trim().isEmpty()){
						
							equObjList.add(ladderLogicUtil.getEquationObj(name, equationVariables, null));
													
							break;
						}
						
						if(matcher.find()){ // variables
														
							equationVariables = ladderLogicUtil.getRestOfVars(line,equationVariables);
							equationVariables.add("|");
						}
						
						if(line.contains("+") || line.contains("-")){ // equation
							//System.out.println(line);
						}
						
					}	
				
				}
				
			}
			
				for(EquationObject eq : equObjList){
				
				System.out.format("Equation: %s Varables: %s  \n", eq.getEquName(),Arrays.toString(eq.getEquVars()));
				}	
			
			
	}

}
