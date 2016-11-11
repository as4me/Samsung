package Vechile;
import java.util.*;

public class Train {
	public static Scanner in = new Scanner(System.in);
	//--------------------------------------------------------------------------------------------------поля
	private double speed;
	private double time;
    private int mass;
	private double lenght;
	private long time1;
	private double speedtrain2;
	private double x;
	//------------------------------------------------------------
	///***************************************************************
	public void message() {
        System.out.println("Я себя чувствую как стрекоза");
    }


	
	public void getx(){
		x = in.nextDouble();
	}
	public void getx(int String){
	System.out.println("Начальная координата" + x);
	}
	
	
	
	///***************************************************************

	//----------------------------------------------------------------------------------методы
	void getTimeToSec(){
	time1 = (long) (time*3600);
	printStatus6();
	}
	
	void getTime() {
		time =in.nextDouble();
		printStatus3();
	}
		
	void Getlenght(){
		lenght = speed*time;
		printStatus5();
	}
	void Getspeed(){
		speed = in.nextDouble();
		printStatus4();
	}

	
	void GetMass(){
		mass = in.nextInt();
		printStatus2();
	}
	void Place1(){
		System.out.println("Начальная скорость 0");
		printStatus2();
		}
	
	public void prnt(){
		
			speedtrain2 = in.nextDouble();
			printStatus7();
		}
		
	private void printStatus2(){
		System.out.println("Масса"+ " " + mass + " кг");
	}	
	private void printStatus3(){
		System.out.println("Время" +  " " + time+ " ч");
	}
	private void printStatus4(){
		System.out.println("Скорость" + " "+ speed+ " км/ч");
		
	
	}
	private void printStatus5(){
		System.out.println("Расстояние" + " "+ lenght + " км/ч");
		}
	protected void printStatus6(){
		System.out.println("Время в секундах " + time1 + " Сек");
		}
	private void printStatus7(){
		System.out.println("Скорость второго поезда "+ speedtrain2+ " Км/ч");
	}
	//===========================================================================================
	

}
