package interfaces;

import java.util.ArrayList;
import java.util.List;

class StructureDataAndAlgorithmsCourse {

	public static void main(String[] args) throws Exception {

		int[] marray = { 19, 71, 3, 14, 7, 8, 1, 6, 0 };

		for (int v : marray) {
			System.out.print(v + ",");
		}

		System.err.println("--------------------\n");

		mergeSort(marray);

		for (int v : marray) {
			System.err.print(v + ",");
		}

		System.err.println("--------------------\n");

	}

	public static void swapNBubleSort(int[] marray) {

		for (int j = 0; j < marray.length - 1; j++) {

			for (int i = 0; i < marray.length - 1; i++) {

				if (marray[i] > marray[i + 1]) {
					int temp = marray[i];

					marray[i] = marray[i + 1];
					marray[i + 1] = temp;

				}
			}
		}

	}

	public static void selectionSort(int[] marray) {

		int largestIndex = 0;

		for (int lastunsortedIndex = marray.length - 1; lastunsortedIndex > 0; lastunsortedIndex--) {

			for (int i = 1; i <= lastunsortedIndex; i++) {
				if (marray[largestIndex] < marray[i]) {
					largestIndex = i;
				}
			}
			int temp = marray[largestIndex];
			marray[largestIndex] = marray[lastunsortedIndex];
			marray[lastunsortedIndex] = temp;

			for (int v : marray) {
				System.out.print(v + " ");

			}
			System.out.println("");

			largestIndex = 0;

		}

	}

	public static void insertionSort(int[] marray) {

		for (int i = 1; i < marray.length; i++) {

			int currentItem = marray[i];

			for (int j = i - 1; j >= 0; j--) {

				if (currentItem < marray[j]) {
					marray[j + 1] = marray[j];
					marray[j] = currentItem;
				}

			}
		}

	}

	public static void shelltSort(int[] marray) {

		for (int v : marray) {
			System.out.print(v + ",");
		}
		System.err.println("--------------------\n");

		int k = (int) marray.length / 2;
		int length = marray.length;

		while (k >= 1) {
			System.out.println("\n k=" + k);

			for (int index = 0; index < marray.length - 1; index++) {

				int i = index;

				int left = 0;
				int right = 0;

				while (i + k < length) {

					left = marray[i];
					right = marray[i + k];

					System.out.println(left + ">" + right);
					if (left > right) {
						System.out.println("swap: " + left + " and" + right);
						marray[i] = right;
						marray[i + k] = left;

					}
					i = i + k;

				}
			}

			k = (int) k / 2;

		}

	}

	public static void mergeSort(int[] marray) {

		int lenght = marray.length;

		int divided = (int) Math.ceil(lenght * 0.5);
		System.out.println("divided=" + divided);

		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		int index = 0;
		int cont = 0;

		while (index < lenght - 1) {

			while (cont <= divided) {
				int value = marray[index];
				left.add(value);
				System.out.println("array: " + cont + " val=" + value);

			}

			index++;

		}

	}
}
