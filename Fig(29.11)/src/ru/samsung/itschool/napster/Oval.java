package ru.samsung.itschool.napster;

public class Oval implements Figure {

	@Override
	public void draw() {
		System.out.println("�� ���������� ����");
		
	}

	@Override
	public void erase() {
		System.out.println("�� ������ ����");
		
	}

	@Override
	public void fill() {
		System.out.println("�� ��������� ����");
		
	}

}
