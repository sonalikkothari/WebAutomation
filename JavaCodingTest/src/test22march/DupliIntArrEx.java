package test22march;

public class DupliIntArrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assuming the int array for 1to 10 nos
		int[] input = {1,2,3,4,9,5,6,7,8,9,10};
		
		int dupli = 0;
		
		for(int i=0;i<input.length-1;i++) {
			for(int j=i+1;j<=input.length-1;j++) {
				if(input[i] == input[j]) {
					dupli = input[i];
					break;
				}
			}
		}
			System.out.println("The duplicate entry is::" +dupli);
	}
	

}
