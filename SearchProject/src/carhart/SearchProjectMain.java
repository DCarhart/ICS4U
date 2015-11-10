package carhart;

public class SearchProjectMain {

	public SearchProjectMain() {
		// TODO Auto-generated constructor stub
	}

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

}
