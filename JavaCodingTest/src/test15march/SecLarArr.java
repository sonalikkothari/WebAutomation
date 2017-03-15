package test15march;

public class SecLarArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,34,45,9,8,90,3};
		int larg,secLarg;
		
		if(arr[0]>arr[1]) {
			larg=arr[0];
			secLarg = arr[1];
		} else {
			larg=arr[1];
			secLarg = arr[0];
		}
		
		System.out.println(larg + "*************" +secLarg);
		 for(int i=2;i<= arr.length-1;i++) {
			if(arr[i]>secLarg && arr[i]< larg) {
				secLarg = arr[i];
				System.out.println("=====" +secLarg);
			} else if (arr[i] > larg) {
				//larg = arr[i];
				secLarg = larg;
				larg = arr[i];
			}
			 /* if(arr[i]>larg && arr[)
			 {
				 larg = arr[i];
				 secLarg = larg;
			 }  else {
				 if(arr[i]>secLarg) {
			 
				 secLarg = arr[i];
				 }
			 }*/
		 }
		System.out.println(larg +"   " + secLarg);
	}

}
//{12,34,45,9,8,90,3}  o/p 45