package com.midgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		SortedSet<String> nameSortedSet = new TreeSet<String>();
		nameSortedSet.add("Rohit");   
		nameSortedSet.add("Priyanka");
		nameSortedSet.add("Aruna");
		nameSortedSet.add("Komal");
		nameSortedSet.add("Mahima");
		nameSortedSet.add("Ravina");

		for (String S1 : nameSortedSet) {
			System.out.println(S1);
		}
	}

}
