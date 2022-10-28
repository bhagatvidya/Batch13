package Batch;

public class Demo2 {
	int a=0; // instance variable

	int b=10;// instance  variable initialization
	static int c=20; // static variable
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 d=new Demo2();
		int e=200;
		System.out.println(e);
		// static variable calling
		System.out.println(c);
		//instance variable calling
		d.display();
		
		//instance variable initialization calling
		//System.out.println(d.b);
		
		
	}


}