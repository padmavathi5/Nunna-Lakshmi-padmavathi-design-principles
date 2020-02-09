package com.epam.task3.epamTask3;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	System.out.println("----Menu----");
        System.out.println("1.Add \n2.Sub \n3.Mul \n4.Div");
    	while(true) {
    		 
    		int a=sc.nextInt();
    		int b=sc.nextInt();
        	Calculator obj=new Calculator(a,b);
        	
             int choice=sc.nextInt();
             if(choice==1)
            	 obj.add(a,b);
             else if(choice==2)
            	 obj.substract(a,b);
             else if(choice==3)
            	 obj.Mul(a, b);
             else if(choice==4)
            	 obj.divide(a, b);
             else {
            	 System.out.println("choose a valid option");
            	 break; 
             }
    	}
    	
    	
    }
}
