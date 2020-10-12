package ua.lgs.lviv.deputat;

import java.util.Scanner;

public class ApplicationDeputat {
	public static void menu () {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
		System.out.println("������ 10 ��� ���� ����� ��������� ��������");
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
			default : System.out.println("���� ������ ������");
			break;
			}
			
		}
		
		
		
		

	}
}
