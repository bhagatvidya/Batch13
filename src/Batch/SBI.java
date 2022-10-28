package Batch;

public class SBI implements Bank,I1,I2{

	public static void main(String[] args) {
		SBI s=new SBI();
		s.personalloan();
		s.vehicleloan();

	}

	@Override
	public void personalloan() {
		System.out.println("8");
		
	}

	@Override
	public void vehicleloan() {
	System.out.println("7");
	}

	@Override
	public void show() {
		System.out.println("Bank balance");
	}

}
