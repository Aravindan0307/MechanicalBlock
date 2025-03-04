package mechanical;

public class MechD {
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		MechD caller= new MechD();
		caller.sum(2,10);
		caller.sum(10,20,30);
	}

	}
	


