package session5;

public class ExceptionEx {

	String str1="123";
	
	public void name() {
		try {
			int i = Integer.parseInt(str1);
			System.out.println("The value of converted String: "+str1);
			
		}catch(Exception e) {
				e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExceptionEx e= new ExceptionEx();
		e.name();
	}
}
