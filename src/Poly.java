
 class Poly {
	
	void display() 
	{
		System.out.println("run");
	}

}
	
	class Poly2 extends Poly
	{
		void display() 
		{
			System.out.println("run");
		}
	public static void main(String[] args) {
		Poly2 t=new Poly2();
			t.display();

	}

}
