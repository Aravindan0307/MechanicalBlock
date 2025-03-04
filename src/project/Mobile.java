package project;

public class Mobile {
	int id =100;  //instance variable
public void oneplus() {
	int id =50;   //local variable
		System.out.println("Oneplus:"+id);
		
	}
public static void samsung() {
		System.out.println("Samsung");
	}
	
public static void main(String[] args) {
		Mobile call= new Mobile();
		call.oneplus();
		samsung();
		System.out.println("call.id");
	}

	
}
