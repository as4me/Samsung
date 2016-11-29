package ru.samsung.itschool.napster;

public class Circle implements Figure {

	@Override
	public void draw() {
		System.out.println("Вы нарисовали круг");
		
	}

	@Override
	public void fill() {
		System.out.println("Вы закрасили круг");
		
	}

	@Override
	public void erase() {
		System.out.println("Вы стерли круг");
	}

}
