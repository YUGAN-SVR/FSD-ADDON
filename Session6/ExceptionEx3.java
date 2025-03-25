package Session6;

public class ExceptionEx3 {

	static void validateAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}else {
			System.out.println("Age is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validateAge(15);
		}catch(IllegalArgumentException e) {
			System.out.println("Caught an Exception: "+e.getMessage());
		}
	}
}
