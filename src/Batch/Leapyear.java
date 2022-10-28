

package Batch;
import java.util.Scanner;

public class Leapyear {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		
		boolean f=false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					f=true;
				else
					f=false;
			}
			else
				f=true;
			
		}
		
		else
			f=false;
		if(f)
		
			System.out.println("Leap year : "+year);
		else
			System.out.println("Not leap year");
		
	}


}