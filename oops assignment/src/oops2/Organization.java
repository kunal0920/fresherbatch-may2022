package oops2;

public class Organization {

	public static void main(String[] args) {
		Labour l=new Labour("Kunal",15000,"Labour");
		Manager m=new Manager("Kalekar",30000,"Manager");
		l.calculateSalary();
		m.calculateSalary();
	}
}
