package carhart;

import java.util.Arrays;

public class SortMain {

	public SortMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int testArray[] = {3, 99, 62, 1, 2, 8, 20, 66, 82, 42, 56};
		System.out.println(Arrays.toString(Sort.selectionSort(testArray)) + "\n");
		System.out.println(Arrays.toString(Sort.insertionSort(testArray)) + "\n");
		System.out.println(Arrays.toString(Sort.bubbleSort(testArray)) + "\n");
		System.out.println(Arrays.toString(Sort.quickSort(testArray, 0, testArray.length-1)) + "\n");
		System.out.println(Arrays.toString(Sort.mergeSort(testArray)) + "\n");
		}
	}
