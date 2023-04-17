package Question1;

public class genrics<s> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genrics vishal = new genrics();
		vishal.setName("Govathoti");
		System.out.println(vishal);
	}
	private s name;
	public s getName() {
		return name;
	}
	public void setName(s name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "name=      " + name;
	}
}
