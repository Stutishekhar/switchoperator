/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchoperator;
import java.util.Scanner;

class SwitchOperator {
    public static void main(String[] args) {

    	char operator;
    	Double number1, number2, result;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter operator (either +, -, * or /): ");
    	operator = scanner.next().charAt(0);
    	System.out.print("Enter number1 and number2 respectively: ");
    	number1 = scanner.nextDouble();
    	number2 = scanner.nextDouble();
    	
    	switch (operator) {
         case '+':
           result = number1 + number2;
    	   System.out.print(number1 + "+" + number2 + " = " + result);
           break;

         case '-':
           result = number1 - number2;
           System.out.print(number1 + "-" + number2 + " = " + result);
           break;

         case '*':
           result = number1 * number2;
           System.out.print(number1 + "*" + number2 + " = " + result);
           break;

         case '/':
           result = number1 / number2;
           System.out.print(number1 + "/" + number2 + " = " + result);
           break;

         default: 
           System.out.println("Invalid operator!");
           break;
        }       
    }
}