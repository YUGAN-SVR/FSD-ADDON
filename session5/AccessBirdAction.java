package session5;

public class AccessBirdAction extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Bird Flys High...");
		
	}

	public static void main(String[] args) {
		AccessBirdAction aba=new AccessBirdAction();
		aba.eat();
		aba.fly();
		
	}
}
