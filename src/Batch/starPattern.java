package Batch;

public class starPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) //rows
		{
			for(int j=1;j<=i;j++) //columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=7;i++) //rows
		{
			for(int j=7;j>=i;j--) //columns
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
