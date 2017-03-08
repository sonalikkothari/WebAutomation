package test8march;

public class ArrayMaxEx {

	public void findMaxArr() {
		int[] arr = {10,101,3,6,2,87,23,65,99};
		int maxArrNo=arr[0];
		
		for(int i=1;i<=arr.length-1;i++) {
		
			if(arr[i] > maxArrNo) {
				maxArrNo = arr[i];
			}
			
		}System.out.println("The maximum no in array is:: " +maxArrNo);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMaxEx arrMaxNo = new ArrayMaxEx();
		arrMaxNo.findMaxArr();
	}

}
