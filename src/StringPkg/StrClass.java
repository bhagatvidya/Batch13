package StringPkg;

public class StrClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Vidya";
		String s2="Bhagat";
		System.out.println(s1+" "+s2);//Concatenation
		
		System.out.println(s1.charAt(2));//CharAt fetching single char 
		System.out.println(s2.length());//length of string
		System.out.println(s1.replaceFirst(s1, s2));//replace string
		System.out.println(s1.compareTo(s2));// compare string
		System.out.println(s2);
		System.out.println(s1.concat(s2));//Concatenation
		System.out.println(s1.toLowerCase());
		System.out.println(s2.concat(s1));
		

}
}
