package question25;

public class DefaultMethod implements Default{
	@Override
	public void sayMore(String msg) {
		System.out.println(msg); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod assignment = new DefaultMethod(); 
		assignment.say(); // calling default method 
		assignment.sayMore(" for practice "); // calling abstract method 
	} 
}
