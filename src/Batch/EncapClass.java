package Batch;

public class EncapClass {
private int sal;
	
	public void setData(int s)
	{
		sal=s;
	}
	public int getData()
	{
		return sal;
	}

	public static void main(String[] args) {
		
	}

}
class A extends EncapClass{
	public static void main(String[] args) {
		A ob=new A();
		ob.setData(50000);
		System.out.println(ob.getData());

	}
	
}