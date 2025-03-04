package mechanical;

public class MechF {
	public void sum(int a, String b) {
		System.out.println(a+b);
	}
	public void sum(String a, int b,float c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MechF calls =new MechF();
		calls.sum(10, "Aravindan");
		calls.sum("Tamil", 10,20);
	}

}
