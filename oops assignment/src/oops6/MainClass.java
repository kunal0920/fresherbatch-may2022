package oops6;

public class MainClass 
{
	public static void main(String[] args)
	{
		
		Persistence p1 = new FilePersist();
		p1.persist();
		Persistence p2 = new DataBasePersist();
		p2.persist();
	}
}