package Question1;

public class genricMethod {
	public static <Demo> void printArray(Demo[] input) {
		for(Demo print: input) {
			System.out.print(print + "            ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String[] s = {"Vishal", "Govathoti"};
		System.out.println("Method Generic  has: ");
		printArray(s);
	}
}



