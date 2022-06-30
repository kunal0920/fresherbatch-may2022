package com.capgemini.java8lambdas;

public class ArithmeticOperation {
	public static void main(String[] args) {
		ArithmeticOperations add = (int a,int b)->a+b;
		ArithmeticOperations sub = (int a,int b)->a-b;
		ArithmeticOperations mul = (int a,int b)->a*b;
		ArithmeticOperations div = (int a,int b)->a/b;
		System.out.println("Addition: "+add.perform(4,2)+
				           "\nSubtraction: "+sub.perform(4,2)+
				           "\nMultiplication: "+mul.perform(4,2)+
				           "\nDivision: "+div.perform(4,2));
	}
	@FunctionalInterface
	public interface ArithmeticOperations {
		public int perform(int a,int b);
	}
	
}