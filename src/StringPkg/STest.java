package StringPkg;

public class STest {

	public static void main(String[] args) {
		String s1="nayan";
		String s2="";
		
		for(int i=4;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		

	}

}
