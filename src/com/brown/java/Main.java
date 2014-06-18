package com.brown.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	static Scanner scanner = null;
	static String filename = "ladderlogictext/equationZ";
	static int lineNum=0;
	static ArrayList<Integer> startIndex = new ArrayList<Integer>();
	static ArrayList<Integer> endIndex = new ArrayList<Integer>();
	static ArrayList<String> equation = new ArrayList<String>();
	static Pattern pEq = Pattern.compile("(\\s+)?(([0-9]+)?(_)?[a-zA-Z]+(_)?([0-9]+)?)\\s+?(.*)");	
	
	
	//static String equation ="";
	
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
				
				if(line.contains("Equation"))continue;					
				if(line.trim().isEmpty())continue;
				
				Matcher matcher = pEq.matcher(line);
				if(matcher.find()){
					System.out.println(line);
					
				}
				else{
					System.out.println(line);
				}
				//System.out.println(line);
				
				
				/*String[] expression =line.split("/[a-zA-z]+/");
				
				System.out.println(expression.length);
				
				for(int i =0; i<expression.length;i++){
					if(!expression[i].toString().isEmpty()){
						equation.add(expression[i].toString());
						System.out.print(expression[i].toString()+ " ");
					}
					
				}
				
				
				System.out.println();*/
			}
			
			
			
			
	}

}
