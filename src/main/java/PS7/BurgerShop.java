package PS7;

import java.util.function.Function;

public class BurgerShop {

	private Function<Burger, Burger> decoration;

	public BurgerShop(Function<Burger, Burger> decoration) {
		this.decoration = decoration;
	}

	public Burger use(Burger baseBurger) {
		System.out.println("Base Burger: " + baseBurger.makeBurger());
		return decoration.apply(baseBurger);
	}
}
