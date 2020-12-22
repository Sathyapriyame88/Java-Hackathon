package javaHackathon;

public class Q62Reverse {

	public static void main(String[] args) {
		int arr[] = { 3,2,4,7,0,3,1,5,8, 4 };
		int k = 3;
		int n = arr.length;
		reverse(arr, n, k);
		System.out.println("The Reversed Array is:");
		for (int i = 0; i < n; i++){
		System.out.print(arr[i] + " ");
		}

	}
		static void reverse(int arr[], int n, int k) {
			for (int i = 0; i < n; i= i+ k) {
				int left = i;
				int right = Math.min(i + k - 1, n - 1);
				int temp;
				while (left < right) {
					temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left =left+1;
					right=right- 1;
				}
			}
		}

}
