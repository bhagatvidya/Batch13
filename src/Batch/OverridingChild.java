package Batch;

public class OverridingChild extends OverridingParent 
{
	void display()
	{
		System.out.println("Child");
	}
	

	public static void main(String[] args) {
		OverridingChild ob=new OverridingChild();
		OverridingParent ob1=new OverridingParent();
		ob.display();
		ob1.display();

	}

}
