//WAP to check with how many numbers the 999 is divisible
package Batch;

public class Demo3 {
	
	public void display()
	{	int i;
	    int count=0;
		for(i=1;i<=999;i++)
		{   
			if(999%i==0)
			{
				count=count+1;
			}	
			
		}
		System.out.println("999 is divisible by "+count+" numbers");
	}

	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.display();

	}

}
