package com.epam.task3.epamTask3;
//import java.io.*;
class Calculator{
	int a;
	int b;
	Calculator(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void add(int a,int b) {
		System.out.println("addition is "+(a+b));
	}
	public void substract(int a,int b) {
		System.out.println("difference is "+(a-b));
	}
	public void Mul(int a,int b) {
		System.out.println("product is "+(a*b));
	}
	public void divide(int a,int b) {
		if(b==0)
			System.out.println("denominator can't be zero");
		else
			System.out.println("quotient is "+(a/b));
	}
}