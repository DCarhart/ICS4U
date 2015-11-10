package carhart;

/**
 * @author 322084039
 *
 */
public class Searches {
	
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
