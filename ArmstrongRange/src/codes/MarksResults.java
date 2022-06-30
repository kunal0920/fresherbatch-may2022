package codes;
import java.util.Scanner;
public class MarksResults {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subject1 marks");
		int sub_1Marks = sc.nextInt();
		System.out.println("enter the subject2 marks");
		int sub_2Marks = sc.nextInt();
		System.out.println("enter the subject3 marks");
		int sub_3Marks = sc.nextInt();

		if((sub_1Marks>60)&&(sub_2Marks>60)&&(sub_3Marks>60))
		{
			System.out.println("student is passed");
		}
		else if((sub_1Marks>60&&(sub_2Marks>60))||(sub_1Marks>60&&(sub_3Marks>60))||(sub_3Marks>60&&(sub_2Marks>60)))
		{
			System.out.println("student is promoted");
		}
		else {
			System.out.println("student is failed");
		}
		sc.close();
	}
}
