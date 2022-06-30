package codes;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args)
	{
		String userName = "kunal kalekar";
		String _name="kunal.kalekar.com";
		
		String _password = "test123";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("enter user name");
			String name = sc.next();
			
			System.out.println("enter password name");
			String password = sc.next();
			
			if((_name.equals(name))&&(password.equals(_password)))
			{
				System.out.println("welcome"+userName);
				break;
			}else {
				if(i==3) {
					System.out.println("contact admin");
				}
				else
				{
					System.out.println("sorry try again");
				}
			}
		}
	}
	}
				
