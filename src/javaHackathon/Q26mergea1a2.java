package javaHackathon;

public class Q26mergea1a2 {
	public static void main(String[] args) {
		int a1[]={1,2,4,6,9,10,0,0,0,0};
		int n=6;
		int size_a=10;
		int a2[]={3,5,7,8};
          int m=4;
          sortedMerge(a1, a2, n, m);
  		printArray(a1, size_a);
         
	}
	static void sortedMerge(int a[], int b[], int n, int m) {
		int i = n - 1;
		int j = m - 1;
		int lastIndex = n + m - 1;

		while (j >= 0) {

			if (i >= 0 && a[i] > b[j]) {

				a[lastIndex] = a[i];
				i--;
			} else {
				a[lastIndex] = b[j];
				j--;
			}
			lastIndex--;
		}
	}

	static void printArray(int arr[], int n) {
		System.out.println("After Merge : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
