package question24;

public class Garbagee {

	protected void finalize() throws Throwable{
		System.out.println("Finalize called,hence garbage collector triggered");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbagee v1 = new Garbagee();
		System.out.println("Calling garbage collector before making null");
		System.gc();
		v1 = null;
		System.out.println("Calling garbage collector after making null");
		System.gc();
	}


}
