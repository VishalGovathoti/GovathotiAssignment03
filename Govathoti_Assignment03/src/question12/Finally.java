package question12;

public class Finally {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			System.out.println("During the try block"); 
			int information=60/0; 
			System.out.println(information); 
		} 
		catch (ArithmeticException e){ 
			System.out.println("Mathematical Error Occurred "+ e); 
		} 
		finally { 
			System.out.println("During the try block"); 
		} 
	}
}



