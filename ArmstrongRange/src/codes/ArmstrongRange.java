package codes;

public class ArmstrongRange {

	public static void main(String[] args) {
		
		for(int i=100;i<=999;i++)
		{
			int n=i,temp=n;
			int res=0;
			
			while(n>0)
			{
				int rem=n%10;
				res=res+(rem*rem*rem);
				n=n/10;
			}
			if(temp==res) {
				System.out.println(i+"");
			}
		}

	}

}
