package com.alliswell.beans;

public class FishPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("@@**Fish Pizza Details**@@");
		System.out.println("--------------------------");
		System.out.println("fish Pizza prepared...");

	}

	@Override
	public void bake() {
		System.out.println("baked pizza...");

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
