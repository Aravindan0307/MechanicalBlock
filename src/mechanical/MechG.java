package mechanical;

public class MechG {
	public void sum(int a, String b,float c) {
		System.out.println(a+b+c);
	}
	public void sum(String a,int b,String c,char d) {
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		MechG call= new MechG();
		call.sum(10,"Jagadeesan",100);
		call.sum( "Anitha",200,"Tamil",'a');
		
	}

}
