package codes;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the principle amount:");
		
		float pAmount = sc.nextFloat();
		float rate = 2;
		float time = 6;
		
		float si=(pAmount*rate*time)/100;
		System.out.println("Simple Intrest is:"+si);
		
		float ci=(float)(pAmount*Math.pow(1+rate/100,time));
		System.out.println("Compound Intrest is:"+ci);

	}

}
