package test22march;

public class CharHighStrEx {
	//static char defau;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "abbcbuhkjashbb"; //ab0c0uhkj0s000
		
		char[] output = input.toCharArray();
		
		
		
		for(char disp: output)
			System.out.println(disp);
		
		//Object[][][] combo = new Object[input.length()][1][1];
		char[] chars = new char[input.length()];
		int[] counts = new int[input.length()];
		
		int l=0;
		for(int i =0;i<=output.length-1;i++) {
		int count= 0 ;
		if(output[i]!= 0) {
			
			for(int j =i+1;j<=output.length-1;j++) {
			if(output[i] == output[j] ) {
				
				output[j] = 0; 
				count++;
			}
			}
		}
		counts[l] = count;
		l++;
		
		}
				for(char disp: output)
				System.out.println(disp);
				
				for(int disp: counts)
					System.out.println(disp);
			
	/*		chars[k] = output[i];
			k++;
			counts[l]= count;
			l++;
		}
	//		combo[i][0]= output[i];
		//	combo[i][0][0]= count;
	}
		
		
}
	/*	for(char disp: chars)
			System.out.println(disp);
		
		for(int disp: counts) 
			System.out.println(disp);*/
	}

	}
