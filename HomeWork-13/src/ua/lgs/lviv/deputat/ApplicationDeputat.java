package ua.lgs.lviv.deputat;

import java.util.Scanner;

public class ApplicationDeputat {
	public static void menu () {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		System.out.println("Введіть 10 щоб дати хабар потрібному депутату");
		};
		
	public static void main(String[] args) {
		VerhovnaRada vr = new VerhovnaRada();
		while(true) {
			menu();
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			switch (input) {
			case "1" : vr.addFractia();
			break;
			case "2" : vr.deleteFractia();
			break;
			case "3" : vr.allFractias();
			break;
			case "4" : vr.cleanExactFractia();
			break;
			case "5" : vr.exactlyFractia();
			break;
			case "6" : vr.addDeputatToExactFractia();
			break;
			case "7" : vr.deleteDeputatFromExactFractia();
			break;
			case "8" : vr.allBridersOfFractia();
			break;
			case "9" : vr.bestBriderOfFractia();
			break;
			case "10" : vr.getBrideExactDeputat();
			default : System.out.println("Немає такого пункту");
			break;
			}
			
		}
		
		
		
		

	}
}
