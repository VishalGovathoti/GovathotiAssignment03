package question12;

public class Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize v = new Finalize();
		v = null;
		System.gc();
		System.out.println("Result from primary method");
	} 
	@Override
	protected void finalize() {
		System.out.println("output from the finished technique");
	}
}


