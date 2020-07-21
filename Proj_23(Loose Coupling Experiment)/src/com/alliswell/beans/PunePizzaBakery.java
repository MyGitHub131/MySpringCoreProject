package com.alliswell.beans;

public class PunePizzaBakery {
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

	public PunePizzaBakery(IPizza pizza) {
		this.pizza = pizza;
	}
}
