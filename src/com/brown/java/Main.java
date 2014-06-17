package com.brown.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = null;
	static String filename = "ladderlogictext/equationZ";
	static int lineNum=0;
	static ArrayList<Integer> startIndex = new ArrayList<Integer>();
	static ArrayList<Integer> endIndex = new ArrayList<Integer>();
	static ArrayList<String> equationValue = new ArrayList<String>();
	static String equation ="";
	
	public static void main(String[] args){
		
		
		
			try {
				 scanner = new Scanner(new File (filename));
			} catch (FileNotFoundException e) {
				System.out.println("file not found: " + filename);
				
			}
			
			scanner.useDelimiter(System.getProperty("line.separator"));
			
			
			while(scanner.hasNext()){
				lineNum++;
				//System.out.println(scanner.next());
				String line = scanner.next();
				
				
				if(line.contains("Equation:")){
					
					if(!LadderLogicEquation.isEquation(line)){						
						endIndex.add(lineNum);
						equationValue.add(LadderLogicEquation.getEquation(line));
						LadderLogicEquation.unsetEquation();
						continue;
					}
					
					if(LadderLogicEquation.isEquation(line)){
						LadderLogicEquation.setEquation(line);
						
						startIndex.add(lineNum);					
					}
					
				
				}
				
				
				
			}
			
			for(int i=0; i<equationValue.size();i++){
				
				System.out.println("Equation " + equationValue.toArray()[i] + " is between " + startIndex.toArray()[i] + " " + endIndex.toArray()[i]);
			}
			
			
	}

}
