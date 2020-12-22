package javaHackathon;

public class Q32Merge1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 };

		int n = 5;
		int size_a = 10;
		int b[] = { 6, 7, 8, 9, 10 };
		int m = 5;
		sortedMerge(a, b, n, m);
		printArray(a, size_a);
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
