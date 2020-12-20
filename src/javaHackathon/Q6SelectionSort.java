package javaHackathon;

public class Q6SelectionSort {

	public static void main(String[] args) {
		int arr[]={20,5,10,8,12};
		for(int i=0;i<arr.length;i++){
	         int pos=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[pos]>arr[j]){
					pos=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		

	}

}
