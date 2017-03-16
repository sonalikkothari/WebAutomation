package test15march;

public class DispNonRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrnum = { 10,20,10,30,20,40,50,10,20,30,40,50};
		
		for(int i =0;i<=arrnum.length-1;i++) {
			if(arrnum[i]!= null) {
				for(int j =i+1;j<=arrnum.length-1;j++) {
				if(arrnum[i] == arrnum[j] ) {
					arrnum[i] = null; 
				}
			}
		}
			
	}
		for(Integer disp : arrnum) {
			if(disp != null) {
				System.out.println(disp);
			}
}
}
}
