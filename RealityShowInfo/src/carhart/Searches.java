package carhart;

import java.util.ArrayList;

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
	
	public static int linearSearch(double[] testArray, double target) {
		for (int i=0; i<testArray.length; i++) {
			if (testArray[i] == target) {
				return(i);
			}
		}
			return (-1);	
	}
	
	public static int linearSearch(String[] testArray, String target) {
		for (int i=0; i<testArray.length; i++) {
			if (testArray[i].equals(target)) {
				return(i);
			}
		}
			return (-1);
	}
	
	public static int linearSearch(ArrayList<ContestantInformation> testArray, ContestantInformation target) {
		for (int i=0; i<testArray.size(); i++) {
			if (testArray.get(i).equals(target)) {
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
	
	public static int binarySearch(double[] testArray, double target) {
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
	
	public static int binarySearch(String[] testArray, String target) {
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
	
	public static int binarySearch(ArrayList<ContestantInformation> testArray, ContestantInformation target) {
		int begIndex = 0;
		int endIndex = testArray.size() - 1;
		do {
			int midIndex = (begIndex + endIndex) / 2;
			if (testArray.get(midIndex).compareTo(target) < 0) {
				begIndex = midIndex + 1;
			}
			else if (testArray.get(midIndex).compareTo(target) > 0) {
				endIndex = midIndex - 1;
			}
			else if (testArray.get(midIndex).compareTo(target) == 0) {
				return midIndex;
			}
		} while (endIndex > begIndex);
		return (-1);
	}
	public static int binarySearch(ArrayList<ContestantInformation> testArray, String firstName, String lastName) {
		int begIndex = 0;
		int endIndex = testArray.size() -1;
		do {
			int midIndex = (begIndex + endIndex) /2;
			if (testArray.get(0).getLName().compareTo(lastName) < 0) {
				return -1;
			}
			else if (testArray.get(0).getLName().compareTo(lastName) > 0) {
				return -1;
			}
			else //if (ci.lastName.compareTo(this.lastName) == 0)
				{
				if (testArray.get(0).getLName().compareTo(firstName) > 0) {
					return -1;
				}
				else if (testArray.get(0).getLName().compareTo(firstName) < 0) {
					return -1; 
				}
				else //if (ci.firstName.compareTo(this.firstName) == 0) 
					{
					return 0;
				}
			}
		}while (endIndex>begIndex);
	}
	
	public int binarySearch(ArrayList<String> aL, String target) {
		return binarySearch(aL, target, 0, aL.size()-1);
	}
	
	private int binarySearch(ArrayList<String> aL, String target, int begin, int end) {
		if (begin > end)
			return -1;
		int mid = (begin + end) /2;
		if (aL.get(mid).compareTo(target) == 0)
			return mid;
		else if (aL.get(mid).compareTo(target) < 0)
			return binarySearch(aL, target, mid+1, end);
		else //if (aL.get(mid).compareTo(target) > 0)
			return binarySearch(aL, target, begin, mid-1);			
	}
}
