package PS7;

public class Burger {

	private String burgerType;

	public Burger(String burgerType) {
		super();
		this.burgerType = burgerType;
	}

	public String makeBurger() {
		return "Base " + burgerType + " burger";
	}


}
