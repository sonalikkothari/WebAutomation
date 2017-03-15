package test15march;

public class ChkBinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbr = 345;
		//int numbr= 101010;
		int chkBin;
		//logic-  chk for each digit if it is not 0/1 the no is not binary
		
		while(numbr!=0) {
			
			chkBin=numbr%10;
			System.out.println("the digit is:" + chkBin );
			if(chkBin !=1 && chkBin !=0){
				System.out.println("The number is not a binary no");
				break;
			}
		numbr = numbr/10;
	}
		System.out.println("The entered no is Binary");
}
}