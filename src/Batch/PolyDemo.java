package Batch;

public class PolyDemo {
	
	
	public void display() 
	{
		System.out.println("This is a Method Overloading");
	}
	public void display(int a,int b)
	{
		System.out.println(a+b);
	}
	public void display(String name)
	{
	
		System.out.println(name);
	}
	public void display(double b)
	{
	
		System.out.println(b);
	}
	public void display(boolean a)
	{
	
		System.out.println(a);
	}
	public void display(char a)
	{
	
		System.out.println(a);
	}


	public static void main(String[] args) {
		PolyDemo p=new PolyDemo();
		p.display();
		p.display(10,20);
		p.display("Vidya");
		p.display(10.55);
		p.display(true);
		p.display('V');

	}

}
