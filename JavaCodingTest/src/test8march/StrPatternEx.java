package test8march;

public class StrPatternEx {

	public void findStrPattern() {
		
		String str1 = "ababahjabaghjabiaba";
		int count =1;
		String str2,tmp;
		
		
		///String tmp = str1.substring(0, 2);
		///System.out.println(tmp);
		//String str2= str1.substring(2,4);
		//System.out.println(str2);
		for(int j= 0;j<=str1.length()-1;j++){	
			count = 1; 
			tmp = str1.substring(j, j+2);
		
			 System.out.println(tmp);
			 if(j == str1.length()-2) {
					break;
				}
			for(int i =2;i<=str1.length()-1;i++) {
				
				if(i == str1.length()-1) {
					break;
				}
				str2 = str1.substring(i,i+2);
				//str2 = str1.charAt(i)+ str1.charAt(i+1);
				//str2 = str1.charAt(i)) + 
		//System.out.println(str2);
			
				if (str2.equalsIgnoreCase(tmp)) {
					count++;
					System.out.println(count);
				}
				
			}
		
			if(count != 2)
				System.out.println("***********" +tmp +"  " +count);
		//System.out.println(count);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrPatternEx strpat = new StrPatternEx();
		strpat.findStrPattern();
	}

}
