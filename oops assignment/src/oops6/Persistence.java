package oops6;

public abstract class Persistence 
{
	public abstract void persist();
}
class FilePersist extends Persistence
{
	public void persist()
	{
		System.out.println("File Persist");
	}
}
class DataBasePersist extends Persistence
{
	public void persist()
	{
		System.out.println("Database Persist");
	}
}