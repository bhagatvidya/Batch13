package Batch;

public class InterphaceC1 implements InParent1,InParent2 {

	public static void main(String[] args) {
		InterphaceC1 p=new InterphaceC1();
		
		p.test();
		p.show();
		
	}

	@Override
	public void test() {
		System.out.println("Parent 1");
	}

	@Override
	public void show() {
		System.out.println("Parent 2");
		
		
	}

}
