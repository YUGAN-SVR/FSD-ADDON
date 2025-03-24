package session5;

public class AccessFoodMenu implements VegItems, NonVegItems {

	@Override
	public void fry() {
		System.out.println("Chicken Leg Fry,Fish Fry");
		
	}

	@Override
	public void gravy() {
		System.out.println("Mutton Gravy, Prawn Gravy");
		
	}

	@Override
	public void breakFast() {
		System.out.println("Poori, Dosa");
		
	}

	@Override
	public void lunch() {
		System.out.println("Sambar Rice, Tomato Rice");
		
	}

	public static void main(String[] args) {
		AccessFoodMenu afm = new AccessFoodMenu();
		afm.breakFast();
		afm.lunch();
		afm.fry();
		afm.gravy();
	}
}
