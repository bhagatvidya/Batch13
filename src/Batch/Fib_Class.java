package Batch;

public class Fib_Class {
	
	
	int num1=0;
	int num2=1;
	int num3=0;
	int count=20;
	
	public void display() {
		System.out.print(num1+" "+num2+" ");
			for(int i=2;i<count;++i)
			{
				num3=num1+num2;
				System.out.print(" "+num3);
				num1=num2;
				num2=num3;
			}
		
	}

	public static void main(String[] args) {

		Fib_Class obj=new Fib_Class();
		obj.display();
			

	}

}
