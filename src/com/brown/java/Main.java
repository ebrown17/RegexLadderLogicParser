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
	static int lineNum=0,nextEq=0;
	
	static ArrayList<Integer> startIndex = new ArrayList<Integer>();
	static ArrayList<Integer> endIndex = new ArrayList<Integer>();
	
	static Queue<String> equationUpper = new LinkedList<String>();
	static Queue<String> equationLower = new LinkedList<String>();
	
	static ArrayList<EquationObject> equObjList = new ArrayList<EquationObject>();
	static Pattern pEq = Pattern.compile("[^+()\n-]+[_a-zA-Z0-9].*");	
	static boolean newEqu = false;
	static boolean ignore = false;
	public static EquationObject equObj;
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
					
					System.out.println(line);
					
					while(scanner.hasNext()){
						
						line = scanner.next();
						
						if(line.contains("Equation")|| line.trim().isEmpty()){
							System.out.println("new equation");
							break;
						}
						
						System.out.println(line);
					}	
					
					
					
					
					
				}
				
			}
			
			
			
			
	}

}
