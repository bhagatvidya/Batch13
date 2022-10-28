package Batch;

public class Test {

	int a=10;
	int b=2;
	int sum;
	int sub;
	int mul;
	int div;
	
	public void addition() {
		sum=a+b;
		System.out.println("Addition :" + sum);
		
		
	}
	public void sub() {
		sub=a-b;
		System.out.println("Subtraction :" + sub);
		
		
	}
	public void mul() {
		mul=a*b;
		System.out.println("Multiplication :" + mul);
		
		
	}
	public void div() {
		div=a/b;
		System.out.println("Division :" + div);
		
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.addition();
		t.sub();
		t.mul();
		t.div();

	}

}
