package m;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mm {
	private static Scanner sc1;
	private static Scanner sc2;
	private static Scanner sc3;

		public static void main(String[] args) {
			System.out.println("Введите текст");
			sc1 = new Scanner(System.in);
			 String text = sc1.nextLine();
			 String[] text1= text.split(" ");
			 System.out.println("Введите место(начало с 0)");
			 int a = 0;
			 sc2 = new Scanner(System.in);
			 try{
		         a = sc2.nextInt();}
		        catch (InputMismatchException fg){
			  System.out.print("Нет числаr" );
		        return;
		}
		System.out.println("Введите символ");
        sc3 = new Scanner(System.in);
        char symbol = sc3.next().charAt(0);
        for(int i = 0; i<text1.length; i++) {


            String newStrArr [] = new String[text1.length];
            if(text1[i].length()>a)
            {
               newStrArr[i] = text1[i].substring(0,a) + symbol + text1[i].substring(a+1);
            }
            else{
             newStrArr[i] = text1[i];
            }
            System.out.println(newStrArr[i]);
        }
		}
		}


