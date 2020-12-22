package javaHackathon;

public class Q5UniqueDuplicate {

	public static void main(String[] args) {
		int arr[]={1,2,1,3,5,2,7,9};
		System.out.println("The Duplicates are:");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					
					System.out.print(arr[j]+" ");
					
				}
			
			}
			
		}
			
	}

}
