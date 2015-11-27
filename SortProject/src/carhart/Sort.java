package carhart;
/*
 * Program capable of sorting an array of numbers via five different sort methods:
 * selection, insertion, bubble, quick, merge
 * contains individual methods for each sort method as well as methods such as partition and merge partition to aid quick and merge sort respectively
 * @param testArray
 * 
 */
public class Sort {

	public Sort() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * method to sort an unsorted array of numbers via selectionSort
	 * selects a number, compares it to the rest of the array, brings it up if it is larger than numbers in front of it
	 * @param testArray
	 * @param return
	 */
	public static int[] selectionSort(int[] testArray){
		
		int first, second, temp;
		for (int i=0;i<testArray.length-1; i++) {
			first = i;
			for (second=i + 1; second<=testArray.length-1;second++) {
				if (testArray[first] > testArray[second]) {
					first = second;
				}
			}
			temp = testArray[i];
			testArray[i] = testArray[first];
			testArray[first] = temp;		
		}
		return testArray;
	}
	
	/*
	 * method to sort an unsorted array of numbers via insertionSort
	 * selects a number, compares it to the entire array, inserts it into its proper position
	 * @param testArray
	 * @param return
	 */
	public static int[] insertionSort(int[] testArray) {
		int i, counter, swap, temp;
		for (i=1; i<=testArray.length-1;i++) {
			swap=testArray[i];
			counter = i-1;
			while (counter>=0 && swap < testArray[counter]) {
				temp = testArray[counter];
				testArray[counter] = testArray[counter+1];
				testArray[counter+1] = temp;
				counter--;
			}
		}
		return testArray;
	}
	
	/*
	 * method to sort an unsorted array of numbers via bubbleSort:
	 * compares numbers in pairs, the largest numbers "bubble" to the top
	 * @param testArray
	 * @param return
	 */
	public static int[] bubbleSort(int[] testArray) {
		int temp;
		for (int i=0;i<testArray.length-1;i++) {
			for (int counter=0;counter<testArray.length-1;counter++) {
				if (testArray[counter] > testArray[counter+1]) {
					int swap = testArray[counter+1];
					testArray[counter] = testArray[counter+1];
					testArray[counter] = swap;
				}
			}
		}
		return testArray;
	}
	/*
	 * method used to partition the array during quickSort
	 * selects pivot value, divides array in two: all numbers smaller than the pivot on one end, all numbers larger on the other
	 * sorts these new subarrays
	 * @param testArray
	 * @param beg
	 * @param end
	 * @return
	 */
	
	public static int quickPartition(int[] testArray, int beg, int end) {
		int temp;
		int pivot = testArray[end];
		int partIndex = beg;
		for (int i=0;i<end;i++) {
				if (testArray[i] <= pivot) {
				temp = testArray[i];
				testArray[i] = testArray[partIndex];
				testArray[partIndex] = temp;
				partIndex++;
			}
		}
		temp = testArray[partIndex];
		testArray[partIndex] = testArray[end];
		testArray[end] = testArray[partIndex];
		return partIndex;
		
	}
	/*
	 * takes an unsorted array of numbers and sorts it via quickSort
	 * recursively calls upon the partition method to accomplish most of the sorting
	 * @param testArray
	 * @param beg
	 * @param end
	 * @return
	 */
	public static int[] quickSort(int[] testArray, int beg, int end) {
		if (beg<end) {
			int partIndex = quickPartition(testArray, beg, end);
			quickSort(testArray,beg,partIndex-1);
			quickSort(testArray,partIndex+1,end);
			
		}
		return testArray;
	}
	
	/*
	 * method to assist mergeSort in partitioning the array
	 * splits initial unsorted array into two halves as many times as necessary to divide the array into a series of one item arrays
	 * compares individual elements which are them merged together so that the final array is sorted from smallest to largest
	 * @param left
	 * @param right
	 * @param testArray
	 * @return
	 */
	
	public static int[] mergePartition(int[] left, int[] right, int[] testArray) {
		int leftNum = left.length;
		int rightNum = right.length;
		int leftIndex = 0;
		int rightIndex = 0;
		int arrayIndex = 0;
		while (leftNum>leftIndex && rightNum>rightIndex) {
			if (left[leftIndex]<=right[rightIndex]) {
				testArray[arrayIndex] = left[leftIndex];
				leftIndex++;
			}
			else {
				testArray[arrayIndex] = right[rightIndex];
				rightIndex++;
			}
			arrayIndex++;
		}
		while (arrayIndex<leftNum) {
			testArray[arrayIndex++] = left[leftIndex++];
		}
		while(arrayIndex<rightNum) {
			testArray[arrayIndex++] = right[rightIndex];
		}
		return testArray;
	}
	/*
	 * method breaks down an unsorted array into two subarrays comprised of two halves of the original array
	 * merge sort then breaks these subarrays into smaller and smaller arrays, then sorts the smallest possible arrays
	 * @param testArray
	 * @return 
	 */
	public static int[] mergeSort(int[] testArray) {
		int i = testArray.length;
		if (i<=1) {
			return testArray;
		}
		int middle = i/2;
		int left[] = new int[middle];
		int right[] = new int[i-middle];
		for (int a=0; a<=middle-1;a++) {
			left[a] = testArray[a];
		}
		for (int b=middle; b<=i-1;b++) {
			right[b-middle] = testArray[b];
		}
		mergeSort(left);
		mergeSort(right);
		mergePartition(left, right, testArray);
		return testArray;
	}

}
