package Batch;

public class PrimeNo {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
				if(count==0)
				{
					System.out.println("Prime No = "+i);
				}
				else
				{
					System.out.println("Not a Prime No ="+i);
				}
			}
			
		}

	}


