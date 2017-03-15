package test15march;


//Input  = {12, 34, 45, 9, 8, 90, 3}
//Output = {12, 34, 8, 90, 45, 9, 3}

public class EvenOddNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {12, 34, 45, 9, 8, 90, 3};
		int[] even = new int[input.length];
		int[] odd = new int[input.length];
		int[] output = new int[input.length];
		int j = 0,k=0;
		
		for(int i =0;i<= input.length-1;i++) {
			if(input[i]%2!=0) {
				odd[j]= input[i];
				j++;
			} else {
				even[k]= input[i];
				k++;
			}
		}
		
		System.out.println("The even no array is::");
		for(int disp : even)
			System.out.println(disp);
		
		System.out.println("The Odd no array is::");
		for(int disp : odd)
			System.out.println(disp);
		
		 int l =0,m =0;
		for(int i =0;i<=input.length-1;i++) {
			if(even[i]!=0) {
		//	while(even[l]!=0) {
			output[l] = even[i];
			l++;
			}
		}
			
			for(int i =0;i<=input.length-1;i++) {
				if(odd[i]!=0) {
			//	while(even[l]!=0) {
				output[l] = odd[i];
				l++;
				}
			/*while(odd[m]!=0) {
				output[i] = odd[m];
				m++;
			}*/
	}
		System.out.println("Even and Odd array is::");
			for(int disp : output)
			System.out.println(disp);
	}
}
