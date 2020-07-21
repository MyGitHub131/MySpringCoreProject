package com.alliswell.beans;

public class GurgaonPizzaBakery {
	private IPizza pizza;

	/*public void setPizza(IPizza pizza) {
		this.pizza = pizza;
	}*/
	public void orderPizza() {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	public GurgaonPizzaBakery(IPizza pizza) {
		this.pizza = pizza;
	}
}
