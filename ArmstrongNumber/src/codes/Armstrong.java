package codes;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int sum=0 ,temp,a;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
		}
			
			
			if(temp==sum)
			
				System.out.println("it is armstrong number");
				else
					System.out.println("it is armstrong number");
			
	}}
			
			
			
