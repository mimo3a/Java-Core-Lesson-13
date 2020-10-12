package ua.lgs.lviv.deputat;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;


public class Fractia {
	
	
	private String nameFractia;
	List<Deputat> fractia = new ArrayList();
	
	public Fractia() {
		super();
		this. fractia = fractia;
	}
	
	public List<Deputat> getFractia() {
		return fractia;
	}

	public String getNameFractia() {
		return nameFractia;
	}

	public void setNameFractia(String nameFractia) {
		this.nameFractia = nameFractia;
	}

	
	@Override
	public String toString() {
		return "Fractia [fractia=" + fractia + ", nameFractia=" + nameFractia + "]";
	}

	public void addDeputat () {
		System.out.println("First name of new deputat");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		
		System.out.println("Last name of new deputat");
		Scanner sc1 = new Scanner(System.in);
		String lastName = sc1.next();
		
		System.out.println("Weight of new deputat");
		Scanner sc2 = new Scanner(System.in);
		int weight = Integer.parseInt(sc2.next());
		
		System.out.println("Height of new deputat");
		Scanner sc3 = new Scanner(System.in);
		int height = Integer.parseInt(sc3.next());
		
		System.out.println("Is a brider or not");
		Scanner sc4 = new Scanner(System.in);
		Boolean brider = Boolean.parseBoolean(sc4.next());
		
		fractia.add(new Deputat( weight,  height, firstName, lastName, brider));
		System.out.println(fractia);
		
	}
	public void deleteDeputat() {
		System.out.println("Fist name of delete deputat");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		
		System.out.println("Last name of delete deputat");
		Scanner sc1 = new Scanner(System.in);
		String lastName = sc.next();
		
		Iterator<Deputat> iterator = fractia.iterator();
		while (iterator.hasNext()) {
			Deputat next = iterator.next();
			if(next.getFirstName().equalsIgnoreCase(firstName) & next.getLastName().equalsIgnoreCase(lastName)) {
				iterator.remove();
			}
		}
		System.out.println(fractia);							
	}
	public void allBriders () {
		Iterator<Deputat> iterator = fractia.iterator();
		while(iterator.hasNext()) {
			Deputat next = iterator.next();
			if(next.getBrider()) {
				System.out.println(next);
			}
		}
	}
	public void bestBrider () {
		int indexBestBrider = 0;
		int bestBride = 0;
		ListIterator<Deputat> iterator = fractia.listIterator();
		while(iterator.hasNext()) {
			Deputat next = iterator.next();
			if(next.getSizeOfBride() > bestBride) {
				System.out.println(next.getSizeOfBride());
				bestBride = next.getSizeOfBride();
				indexBestBrider = iterator.nextIndex() - 1;
			}
		}
		System.out.println(fractia.get(indexBestBrider));
		
	}
	public void allDeputatsOfFractia () {
		ListIterator<Deputat> iterator = fractia.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public void clearFractia () {
		fractia.clear();

	}
	public void getBrideToDeputat() {
		System.out.println("¬вед≥ть	≥м'€ депутата хабарника");																																			
		Scanner sc = new Scanner(System.in);
		String firstNameBrider = sc.next();
		System.out.println("¬вед≥ть пр≥звище депутата хабарника");
		Scanner sc1 = new Scanner(System.in);
		String lastNameBrider = sc1.next();
		Iterator <Deputat>iterator = fractia.iterator();
		while(iterator.hasNext()) {
			Deputat next = iterator.next();
			String firstName = next.getFirstName();
			String lastName = next.getLastName();
			if (firstName.equalsIgnoreCase(firstNameBrider) & lastName.equalsIgnoreCase(lastNameBrider)) {
				next.bride();
			}
		}
	}
	
	

}
