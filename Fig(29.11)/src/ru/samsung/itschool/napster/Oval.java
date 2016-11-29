package ru.samsung.itschool.napster;

public class Oval implements Figure {

	@Override
	public void draw() {
		System.out.println("Вы нарисовали овал");
		
	}

	@Override
	public void erase() {
		System.out.println("Вы стерли овал");
		
	}

	@Override
	public void fill() {
		System.out.println("Вы закрасили овал");
		
	}

}
