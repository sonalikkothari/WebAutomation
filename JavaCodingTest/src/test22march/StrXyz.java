package test22march;

public class StrXyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
										//output: xyz,yzx,zxy,xzy,yxz,zyx
		String input = "xyz";
		
		String[] output = new String[6];
		
		char[] charArr = input.toCharArray();
		
		for(char disp: charArr) {
			System.out.println(disp);
		}
		
		char[] chang0 = {charArr[0],charArr[1],charArr[2]};
		char[] chang1 = {charArr[1],charArr[2],charArr[0]};
		char[] chang2 ={charArr[2],charArr[0],charArr[1]};
		char[] chang3 = {charArr[0],charArr[2],charArr[1]};
		char[] chang4 = {charArr[1],charArr[0],charArr[2]};
		char[] chang5 ={charArr[2],charArr[1],charArr[0]};
		
		
		String output1 = String.valueOf(chang0);
		System.out.println(output1);
		String output2 = String.valueOf(chang1);
		System.out.println(output2);
		String output3 = String.valueOf(chang2);
		System.out.println(output3);
		String output4 = String.valueOf(chang3);
		System.out.println(output4);
		String output5 = String.valueOf(chang4);
		System.out.println(output5);
		String output6 = String.valueOf(chang5);
		System.out.println(output6);
		
		

	/*	char[][] change = new char[6][3]; 
		
			for(int i =0;i<6;i++) {
				for(int j=0;j<3;j++) {
					change[i] = {charArr[j]
				}
			}*/
	}

}
