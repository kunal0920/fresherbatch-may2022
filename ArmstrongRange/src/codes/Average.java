package codes;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		{
			int subjects[]=new int [3];
			float total=0,avg;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the 3 subjects");
			for(int i=0;i<3;i++)
			{
				subjects[i]=sc.nextInt();
				
				total=total+subjects[i];
				avg=subjects[i]/3;
				System.out.println("average marks scored by each student is"+avg);
			}
			System.out.println("total marks is "+total);
			avg=total/3;
			System.out.println("average marks is"+avg);
			
	}

}
}