package Batch;

public class AbstractChild extends AbstractParent{
	

	public static void main(String[] args) {
		AbstractChild ob=new AbstractChild ();
		ob.show();

	}

	@Override
	void show() {
		System.out.println("Abstract Parent");
	}

}
