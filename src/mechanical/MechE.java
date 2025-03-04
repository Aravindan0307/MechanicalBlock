package mechanical;

public class MechE {
	public void sum(float a,float b) {
		System.out.println(a+b);
	}
	public void sum(float a,float b,float c) {
		System.out.println(a+b+c);


	}
	public static void main(String[] args) {
		MechE call= new MechE();
		call.sum(25,50);
		call.sum(50,100,200);
		
	}
}

