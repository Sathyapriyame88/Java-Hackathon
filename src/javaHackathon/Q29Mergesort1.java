package javaHackathon;

public class Q29Mergesort1 {

	public static void main(String[] args) {
		int[] numbers = { 10, 3, 5, 14, 2, 25, 1 };

		printArray("Final Merge Sort Array is:", mergeSort(numbers));

}
public static int[] mergeSort(int[] input) {
		
		if (input.length == 1) {
		return input;
		}
		int[] sorted = new int[input.length];
		int mid = input.length / 2;
		int[] left = new int[mid];
		for (int i = 0; i < mid; i++) {
			left[i] = input[i];
		}
		
		int[] right = new int[input.length - mid];
		for (int i = 0; i < input.length - mid; i++) {
			right[i] = input[mid + i];
		}
		
		int[] sortedLeft = mergeSort(left);
		int[] sortedRight = mergeSort(right);

		for (int i = 0, l = 0, r = 0; i < input.length; i++) {
			if (l >= sortedLeft.length) {
				sorted[i] = sortedRight[r];
				r++;
			} else if (r >= sortedRight.length) {
				sorted[i] = sortedLeft[l];
				l++;
			} else if (sortedLeft[l] <= sortedRight[r]) {
				sorted[i] = sortedLeft[l];
				l++;
			} else {
				sorted[i] = sortedRight[r];
				r++;
			}

		}

	
		return sorted;
	}

	public static void printArray(String arrayName, int[] input) {
		System.out.print(arrayName + " : ");
		for (int n : input) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	
	
	
}
