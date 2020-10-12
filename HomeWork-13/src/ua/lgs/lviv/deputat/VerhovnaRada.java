package ua.lgs.lviv.deputat;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

public class VerhovnaRada {
	List <Fractia>verhovnaRada = new ArrayList();

	public List<Fractia> getVerhovnaRada() {
		return verhovnaRada;
	}
	public void addFractia() {
		System.out.println("������ ����� ������� �� ��������");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fractia fr = new Fractia();
		fr.setNameFractia(name);
		verhovnaRada.add(fr);
	}
	public void deleteFractia() {
		System.out.println("������ ����� ������� �� �����������");
		Scanner sc = new Scanner(System.in);
		String deletedFractia = sc.next();
		Iterator<Fractia> iterator = verhovnaRada.iterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(deletedFractia)) {
				iterator.remove();
			}
		}
	}
	public void allFractias () {
		Iterator<Fractia> iterator = verhovnaRada.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	public void exactlyFractia() {
		System.out.println("������ ����� ��������� ������� �� ����� �������");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		Iterator<Fractia> iterator = verhovnaRada.iterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				System.out.println(next);
			}
		}
		
	}
	public void addDeputatToExactFractia () {
		
		System.out.println("������ ����� ������� ���� �������� �������");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		Iterator<Fractia> iterator = verhovnaRada.iterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				next.addDeputat();
			}
		}
		
	}
	public void deleteDeputatFromExactFractia () {
		System.out.println("������ ����� ������� ����� ����������� �������");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		Iterator<Fractia> iterator = verhovnaRada.iterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				next.deleteDeputat();
			}
		}
	}
	public void allBridersOfFractia () {
		System.out.println("������ ����� ������� � ��� ����� ������� ���������");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		ListIterator<Fractia> iterator = verhovnaRada.listIterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				next.allBriders();
			}
		}
	}
	public void bestBriderOfFractia () {
		System.out.println("������ ����� ������� � ��� ����� ������� ���������� ���������");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		ListIterator<Fractia> iterator = verhovnaRada.listIterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				next.bestBrider();;
			}
		}
	}
	public void getBrideExactDeputat () {
		System.out.println("������ ����� ������� �������� ��� ����� ���� �����");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		ListIterator<Fractia> iterator = verhovnaRada.listIterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				next.getBrideToDeputat();
				
			}
		}
	}
	public void allDeputatFractia () {
		System.out.println("������ ����� ������� ��� ������� ��� ��������");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		ListIterator<Fractia> iterator = verhovnaRada.listIterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				next.allDeputatsOfFractia();
				
			}
		}		
	}
	public void cleanExactFractia () {
		System.out.println("������ ����� ������� ��� �� ��������");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		ListIterator<Fractia> iterator = verhovnaRada.listIterator();
		while(iterator.hasNext()) {
			Fractia next = iterator.next();
			if(next.getNameFractia().equalsIgnoreCase(exactName)) {
				next.clearFractia();
				
			}
		}		
	}
	
}
