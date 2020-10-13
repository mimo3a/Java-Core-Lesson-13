package ua.lgs.lviv.deputat;
import java.util.Comparator;

public class DeputatBriderComporator implements Comparator <Deputat> {
	public int compare(Deputat d1, Deputat d2) {
		return d1.getSizeOfBride() < d2.getSizeOfBride() ? 1: -1;
				
	}

}
