package test22march;

public class ArrIndxProdEx {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] input = {5,7,10,2};
		int[] output = new int[input.length];
		
		
		for(int i=0;i<=input.length-1;i++) {
			int prod = 1;
			for(int j=0;j<=input.length-1;j++) {
				if(i!=j) {
				prod = prod* input[j];
				}
			}
			System.out.println("the product is::" +prod);
			output[i]= prod;
			//prod = 1;
		}
		System.out.println("******************************");
			for(int disp: output)
				System.out.println("the output array is::" +disp);
}
}
