package package1;

public class Student {

	int rollNo;
	int age;
	
	public void display1()
	{
		
		System.out.println("Welcome all of you");
	}
	
	public void display2()
	{
		
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		
		Student ilakkiya = new Student();
		ilakkiya.rollNo = 12;
		ilakkiya.age = 35;
		
		System.out.println(ilakkiya.rollNo);
		System.out.println(ilakkiya.age);
		
		ilakkiya.display1();
		ilakkiya.display2();
		
	}
	
}
