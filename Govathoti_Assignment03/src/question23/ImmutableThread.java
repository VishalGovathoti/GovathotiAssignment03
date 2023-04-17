package question23;

public class ImmutableThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "VISHAL";
		name.concat("GOVATHOTI");
		System.out.println("name : " +name);
		Thread v1 = new Thread(new Runnable() {
			public void run() {
				name.concat("v1");
				System.out.println("Thread: " +name);
			}
		});
		Thread v2 = new Thread(new Runnable() {
			public void run() {
				name.concat("v2");
				System.out.println("Thread1 : " +name);
			}
		});
		v1.start();
		v2.start();
	}
}



