package Batch;

public class Test2 {
	
	//Non static method
	public void read() {
		System.out.println("I am reading");
		
	}
	// Static method
	 static void write(){
	
		 System.out.println("I am writing");
	}
	

	public static void main(String[] args) {
		
		Test2 t=new Test2();
		t.read();
		write();

	}

}
