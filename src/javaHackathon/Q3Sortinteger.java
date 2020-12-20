package javaHackathon;

public class Q3Sortinteger {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 20, 2, 1, 12 };
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
			
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
		}
		System.out.print("The sorted Array is:");
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
		}

	}
}
