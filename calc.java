package calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double operandOne;
		double operandTwo;
		
		Scanner inputOperator = new Scanner(System.in); 
		    System.out.println("Enter add/sub/mul/div");
		    String operator = inputOperator.nextLine();  
		    
			System.out.println("Enter operands");
		    operandOne = Double.parseDouble(inputOperator.nextLine()); 
		    operandTwo = Double.parseDouble(inputOperator.nextLine());
		     
		    
		   switch(operator) {
		   case "add":
		   {
			   System.out.println(add(operandOne,operandTwo));
			   break;
		   }
		   case "sub":
		   {
			   System.out.println(sub(operandOne,operandTwo));
			   break;
		   }
		   case "mul":
		   {
			   System.out.println(mul(operandOne,operandTwo));
			   break;
		   }
		   case "div":
		   {
			   System.out.println(div(operandOne,operandTwo));
			   break;
		   }
		   default:{
			   System.out.println("Invalid");
		   }
		   }
		    

	}
	
	public static double add(double a,double b) {
		return (a+b);
		
	}
	public static double sub(double a,double b) {
		return (a-b);
		
	}
	public static double mul(double a,double b) {
		return (a*b);
		
	}
	public static double div(double a,double b) {
		return (a/b);
		
	}
	

}

