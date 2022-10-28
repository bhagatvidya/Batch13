package Batch;

public class Child2 extends Parent1{

	public static void main(String[] args) {
		
		Child2 ob=new Child2();
		ob.test();
		ob.read();

	}

	@Override
	public void read() {
		System.out.println("I am reading");
	}

}
