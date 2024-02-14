package PS7;

import java.util.function.Function;

public class TestBurger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger basicBurger = new Burger("Base");

		// Using Decorator Pattern with Java 8 Lambda Expressions
		Function<Burger, Burger> veggieDecorator = burger -> {
			System.out.println("Adding veggies to the burger");
			return new Burger(burger.makeBurger() + " Veggie");
		};

		Function<Burger, Burger> cheeseDecorator = burger -> {
			System.out.println("Adding cheese to the burger");
			return new Burger(burger.makeBurger() + " Cheese");
		};

		// Create BurgerShop with decorators
		BurgerShop burgerShop = new BurgerShop(veggieDecorator.andThen(cheeseDecorator));

		// Place an order and get the specified output
		Burger decoratedBurger = burgerShop.use(basicBurger);
		System.out.println("Final Burger: " + decoratedBurger.makeBurger());
	}

}
