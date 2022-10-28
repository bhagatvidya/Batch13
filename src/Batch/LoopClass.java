package Batch;

public class LoopClass {

	int i;
	
	public void display() {
		
		for(i=1;i<=5;i++)
			for(int j=5;j>=i;j++)
		{
		
			System.out.print("*");
		}
	}
		public void read()
		{
			int j=0;
			do {
				System.out.println("@");
				j++;
			}
			while(j<3);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopClass l=new LoopClass();
		l.display();
		l.read();
	}

}
