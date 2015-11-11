package carhart;

/**
 * @author 322084039
 *
 */
public class Searches {
	
	public static void main(String[] args) {
		int[] intArray1 = {1,2,3,64,34,12,79,31,23,56,42,75,78,95,34,123,345,645,76,77,21,677,88,99,23};
		int intTarg1 = 42;
		System.out.println(Searches.linearSearch(intArray1, intTarg1));
		
		double[] doubleArray1 = {2.5,5.6,7.2,1.1,4.2,8.9,0.3,423.43,67.5,12.3,34.7,56.21,89.7,32.8};
		double dubTarg1 = 67.5;
		System.out.println(Searches.linearSearch2(doubleArray1, dubTarg1));
		
		String[] stringArray1 = {"Cat", "Dog", "Mouse", "Giraffe", "Lion", "Tiger", "Unicorn"};
		String stringTarg1 = "Lion"; 
		System.out.println(Searches.linearSearch3(stringArray1, stringTarg1));
		
		int[] intArray2 = {12, 23, 57, 99, 104};
		int intTarg2 = 99;
		System.out.println(Searches.binarySearch(intArray2, intTarg2));
		
		double[] doubleArray2 = { 0.23, 0.42, 1.9, 2.76, 8.4, 9.6};
		double dubTarg2 = 1.9;
		System.out.println(Searches.binarySearch2(doubleArray2, dubTarg2));
		
		String[] stringArray2 = {"Cat", "Dog", "Lion", "Mouse", "Tiger", "Unicorn", "Giraffe"};
		String stringTarg2 = "Mouse"; 
		System.out.println(Searches.binarySearch3(stringArray2, stringTarg2));
	}
	
	public static int linearSearch(int[] testArray, int target) {
		for (int i=0; i<testArray.length; i++) {
			if (testArray[i] == target) {
				return(i);
			}
		}
			return (-1);	
	}
	
	public static int linearSearch2(double[] testArray, double target) {
		for (int i=0; i<testArray.length; i++) {
			if (testArray[i] == target) {
				return(i);
			}
		}
			return (-1);	
	}
	
	public static int linearSearch3(String[] testArray, String target) {
		for (int i=0; i<testArray.length; i++) {
			if (testArray[i].compareTo(target) == 0) {
				return(i);
			}
		}
			return (-1);
	}
	
	public static int binarySearch(int[] testArray, int target) {
		int begIndex = 0;
		int endIndex = testArray.length - 1;
		do {
			int midIndex = (begIndex + endIndex) / 2;
			if (testArray[midIndex] < target) {
				begIndex = midIndex + 1;
			}
 			else if (testArray[midIndex] > target) {
				endIndex = midIndex - 1;
			}
			else if (testArray[midIndex] == target) {
				return midIndex;
			}
		} while (endIndex > begIndex);
		return (-1);
	}
	
	public static int binarySearch2(double[] testArray, double target) {
		int begIndex = 0;
		int endIndex = testArray.length - 1;
		do {
			int midIndex = (begIndex + endIndex) / 2;
			if (testArray[midIndex] < target) {
				begIndex = midIndex + 1;
			}
			else if (testArray[midIndex] > target) {
				endIndex = midIndex - 1;
			}
			else if (testArray[midIndex] == target) {
				return midIndex;
			}
		} while (endIndex > begIndex);
		return (-1);
	}
	
	public static int binarySearch3(String[] testArray, String target) {
		int begIndex = 0;
		int endIndex = testArray.length - 1;
		do {
			int midIndex = (begIndex + endIndex) / 2;
			if (testArray[midIndex].compareTo(target) < 0) {
				begIndex = midIndex + 1;
			}
			else if (testArray[midIndex].compareTo(target) > 0) {
				endIndex = midIndex - 1;
			}
			else if (testArray[midIndex].compareTo(target) == 0) {
				return midIndex;
			}
		} while (endIndex > begIndex);
		return (-1);
	}
}
