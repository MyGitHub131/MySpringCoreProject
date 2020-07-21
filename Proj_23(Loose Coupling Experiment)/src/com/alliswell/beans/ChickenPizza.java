package com.alliswell.beans;

public class ChickenPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("@@**Chicken Pizza Details**@@");
		System.out.println("-----------------------------");
		System.out.println("Chicken Pizza prepared...");

	}

	@Override
	public void bake() {
		System.out.println("pizza baked...");

	}

	@Override
	public void cut() {
		System.out.println("cutting started...");

	}

	@Override
	public void box() {
		System.out.println("boxing started...");

	}

}
