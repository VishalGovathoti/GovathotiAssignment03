package question18;

public class ThreadsDemo extends Thread {
	public void run(){ 
		System.out.println("progress..."); 
	} 
	public static void main(String args[]){ 
		ThreadsDemo v1=new ThreadsDemo(); 
		v1.start(); 
		v1.start(); 
	} 
}
