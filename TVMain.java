package assignment_3;

import java.util.ArrayList;
import java.util.Collections;

public class TVMain {
	public static void main(String[] args) {
		ArrayList<HDTV> aL = new ArrayList<HDTV>();
		
		aL.add(new HDTV("Hitachi", 50));
		aL.add(new HDTV("Samsung", 70));
		aL.add(new HDTV("Panasonic", 32));
		
		System.out.println(aL.toString());
		
		Collections.sort(aL);
		System.out.println("Sort from TV Size (decreasing order)");
		
		System.out.println(aL.toString());
	}
}
