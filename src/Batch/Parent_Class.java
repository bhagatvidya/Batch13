package Batch;

public class Parent_Class {
	
	int a=5;
	int b=4;
	int c=a+b;
	String name="Vidya";
	String t="Testing";
	public void read()
	{
		System.out.println("Name of student:"+name);
	}
	public void display()
	
	{
		
		System.out.println("Name of Course:"+t);
		System.out.println("Mock Result of Student");
		System.out.println("Manual :"+a);
		System.out.println("Automaton :"+b);
		
		System.out.println("Total :"+c);
		
	}
	public class Child2 {
		public void write()
		{
			System.out.println("write");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_Class ob1=new Parent_Class();
		ob1.display();
		
		
		

	}

}
