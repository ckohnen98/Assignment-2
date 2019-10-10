/* Colton Kohnen
 * ASU ID: 1212515198
 * https://github.com/ckohnen98/Assignment-2
 * 
 * 
 */



package cse360assign2;

import java.util.*;


public class AddingMachine {
	private int total;
	private int optotal = 0;
	
	
	List<Integer> method = new ArrayList<>();
	List<Integer> action = new ArrayList<>();
	
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		
		int val = value;
		total = total + val;
		optotal++;
		action.add(value);
		method.add(1);
	}
	
	
	
	public void subtract (int value) {
		
		int val = value;
		total = total - val;
		optotal++; 
		
		action.add(value);
		method.add(0);
		
	}
		
	public String toString () {
		
		String start =  "0 ";		
		String printout = "";
		
		for(int i = 0; i < method.size(); i++) {
			
			
			if(method.get(i) == 1) {
				printout = printout + " +" + action.get(i);
			}
			else {
				printout = printout + " -" + action.get(i);
			}
			
			
			
		}
		
		
		return start + printout;
	}

	public void clear() {
		total = 0;
	}
}
