package test15march;

import java.util.HashSet;
import java.util.Set;

public class PrntNonRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrno = { 10,20,10,30,20,40,50,10,20,30,40,50};
		
		Set<Integer> hshSet = new HashSet<Integer> ();
		
		
		for(Integer disp : arrno) {
			hshSet.add(disp);				//set(collection) adds only unique entries thus eliminates repeated entries
	}										//as its a set o/p won't be sorted
		for(Integer disp: hshSet) {
			System.out.println(disp);
		}
}
}