package coll;

import java.util.*;


public class Coll2 {
	public static void main(String[] args) {
	
	List<String>fruit = new ArrayList<String>();
	fruit.add("mango");
	fruit.add("red");
	fruit.add("apple");
	
	//Collections.sort(fruit);
	for(String neww:fruit)
		System.out.println(neww);
	
	
	List<Integer>numbers = new ArrayList<Integer>();
	
	numbers.add(23);
	numbers.add(233);
	numbers.add(2332);
	numbers.remove(0);
	for(Integer sdk:numbers)
		System.out.println(sdk);
	
	

}
}