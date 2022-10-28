package Batch;

public class Swap_Class {
	
	int a=10;
	int b=20;
	int temp1;
	
	public void swap()
	{
		temp1=a;
		a=b;
		b=temp1;
		//System.out.println("Temp value"+temp1);
		System.out.println("Swapping two Numbers:");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("temp ="+temp1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap_Class obj=new Swap_Class();
		obj.swap();

	}

}
