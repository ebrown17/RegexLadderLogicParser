/*package com.brown.java;

public class backup {
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

		
		public static void main(String[] args){
			
			
			
				try {
					 scanner = new Scanner(new File (filename));
				} catch (FileNotFoundException e) {
					System.out.println("file not found: " + filename);
					
				}
				
				scanner.useDelimiter(System.getProperty("line.separator"));
				
				
				while(scanner.hasNext()){
					lineNum++;
					
					String line = scanner.next();				
					
					if(line.contains("Equation")|| line.trim().isEmpty()){
						newEqu=true;
						continue;					
					}
				
					
					Matcher matcher = pEq.matcher(line);
					if(matcher.find()&& newEqu){
						System.out.println(line);
						
						line=line.replaceAll("\\|", " ");
									
						if(nextEq==0){
							
							String[] size = line.split("\\s");
							
							for(int i=size.length-1; i>=0;i--){
							
								
								if(size[i].toString().isEmpty())continue;
								
								equationUpper.add(size[i].toString());							
							}	
							nextEq++;
						} else {
							
							String[] size = line.split("\\s");
							
							for(int i=size.length-1; i>=0;i--){
								
								if(size[i].toString().isEmpty())continue;
								
								equationLower.add(size[i].toString());
							
							} nextEq=0;
						}
						
						
						
					}
					else{
						
						/// here is where equation logic grabbing goes
						
						
						if(nextEq%2==0){
							
							String name = equationUpper.poll();
							
							//System.out.format("Equation: %s", equationUpper.poll());
						
							Collections.reverse((List<?>) equationUpper);						
							Collections.reverse((List<?>) equationLower);
							
							//System.out.print(" Variables are: ");
							String[] equUpper = new String[equationUpper.size()];
							int i=0;
							while(equationUpper.peek()!=null){
								//System.out.format("%s ", equationUpper.poll());
								equUpper[i]=equationUpper.poll();
								i++;
							}
							
							String[] equLower = new String[equationLower.size()];
							int j=0;
							while(equationLower.peek()!=null){
								//System.out.format("%s ", equationLower.poll());
								equLower[j]=equationLower.poll();
								j++;
							}
							
							
							equObj = new EquationObject(name, equUpper, equLower, null, null);
							equObjList.add(equObj);
							//System.out.format("Equation: %s Varables upper: %s Varables lower: %s \n", equObj.getEquName(),Arrays.toString(equObj.getEquVarsUpper()),Arrays.toString(equObj.getEquVarsLower()));
							//System.out.println("new equation");
						}
					}
					
				}
				
				for(EquationObject eq : equObjList){
					
				System.out.format("Equation: %s Varables upper: %s Varables lower: %s \n", eq.getEquName(),Arrays.toString(eq.getEquVarsUpper()),Arrays.toString(eq.getEquVarsLower()));
				}	
				
				//System.out.println(equation.toString());
				
		}

	}


}
*/