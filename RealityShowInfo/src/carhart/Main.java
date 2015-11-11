package carhart;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	
	/*
	 * 11/11/15
	 * David Carhart
	 * Main class of Reality Show Project
	 * Program takes in candidates entered by the user, adds them to an array list, and can print out, search for delete one or all of the list, save the contestants to a text file, load from the file and sort the entire list
	 */

	public Main() {

	}
	/** 
	* @param contestantAL
	* Main menu -- where user selects command
	*/
	public static void main(String[] args) throws IOException, InvalidInputException {
		ArrayList<ContestantInformation> contestantAL = new ArrayList<ContestantInformation>();
		boolean repeat = true;
		Scanner scan = new Scanner(System.in);
		String input;
		do {
			System.out.println("Choose one of the following:");
			System.out.println("1. Add new contestant" + "\n" + "2. Print labels" + "\n" + "3. Search" + "\n" + "4. Delete contestant." + "\n" + "5. Clear all contestants." + "\n" + "6. Save" + "\n" + "7. Load" + "\n" + "8. Sort" + "\n" + "9. Exit program.");
			input = scan.nextLine();
			if (input.equals("1") || input.equalsIgnoreCase("Add new contestant") || input.equalsIgnoreCase("Add new contestant.")) {
				addContestant(contestantAL);
			}
			else if (input.equals("2") || input.equalsIgnoreCase("Print labels") || input.equalsIgnoreCase("Print labels.")) {
				printLabels(contestantAL);
			}
			else if (input.equals("3") || input.equalsIgnoreCase("Search")  || input.equalsIgnoreCase("Search.")) {
				searchContestants(contestantAL);
			}	
			else if (input.equals("4") || input.equalsIgnoreCase("Delete contestant") || input.equalsIgnoreCase("Delete contestant.")) {
				deleteContestant(contestantAL);
			}
			else if (input.equals("5") || input.equalsIgnoreCase("Clear all contestants") || input.equalsIgnoreCase("Clear all contestants.")) {
				deleteAll(contestantAL);
			}
			else if (input.equals("6") || input.equalsIgnoreCase("Save") || input.equalsIgnoreCase("Save.")) {
				saveContestants(contestantAL);
			}
			else if (input.equals("7") || input.equalsIgnoreCase("Load") || input.equalsIgnoreCase("Load.")) {
				loadContestants(contestantAL);
			}
			else if (input.equals("8") || input.equalsIgnoreCase("Sort") || input.equalsIgnoreCase("Sort.")) {
				sortContestants(contestantAL);
			}
			else if (input.equals("9") || input.equalsIgnoreCase("Exit")  || input.equalsIgnoreCase("Exit.") || input.equalsIgnoreCase("Exit program") || input.equalsIgnoreCase("Exit program.")) {
			input = "9";	
			}	
		} while (!input.equals("9"));
	}
	/**
	* @param contestantAL fName, lName, StName, StNum, city, province, postalCode, phoneNum, DoB, MoB, YoB
	* Adds contestant to contestantAL
	*/
	public static void addContestant(ArrayList<ContestantInformation> contestantAL) {
		boolean repeat = true;
		Scanner scan = new Scanner(System.in);
		do {
			ContestantInformation contestant1 = new ContestantInformation();
			boolean flag = false;
			
			String fName, lName, StName, StNum, city, province, postalCode, phoneNum;
			int DoB, MoB, YoB;

			System.out.println("Input your first name.");
			do {
				fName = scan.nextLine();
				flag = false;
				try {
					contestant1.setFName(fName);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input your last name.");
			do { 
				lName = scan.nextLine();
				flag = false;
				try {
					contestant1.setLName(lName);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input your street name.");
			do {
				StName = scan.nextLine();
				flag = false;
				try {
					contestant1.setStName(StName);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input your house or apartment number.");
			do {
				StNum = scan.nextLine();
				flag = false;
				try {
					contestant1.setStNum(StNum);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input your city.");
			do {
				city = scan.nextLine();
				flag = false;
				try {
					contestant1.setCity(city);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input your province.");
			do {
				province = scan.nextLine();
				flag = false;
				try {
					contestant1.setProvince(province);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input your postal code (with no dash).");
			do {
				postalCode = scan.nextLine();
				flag = false;
				try {
					contestant1.setPostalCode(postalCode);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input your phone number (with no parentheses or dashes).");
			do {
				phoneNum = scan.nextLine();
				flag = false;
				try {
					contestant1.setPhoneNum(phoneNum);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input the day you were born in DD format (ex: 05).");
			do {
				DoB = scan.nextInt();
				flag = false;
				if (DoB > 31) {
					System.out.println("That's not a possible date.");
				}
				try {
					contestant1.setDoB(DoB);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input the month you were born in MM format (ex: 03).");
			do {
				MoB = scan.nextInt();
				flag = false;
				if (MoB > 12) {
					System.out.println("There is no month" + MoB);
				}
				try {
					contestant1.setMoB(MoB);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			flag = false;
			System.out.println("Input the year you were born in YY format (ex: 98).");
			do {
				YoB = scan.nextInt();
				flag = false;
				try {
					contestant1.setYoB(YoB);
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage()); 
					flag = true;
				}
			} while (flag);
			System.out.println("What colour is an orange?");
			String answer1 = scan.next();
			if (answer1.equalsIgnoreCase("Orange") || answer1.equalsIgnoreCase("Orange.")) {
				System.out.println("Congratulations! You're in!");
			}
			else {
				System.out.println("Sorry, you don't qualify.");
				repeat = false;
			}
			contestantAL.add(contestant1);
			System.out.println("Would you like to add another contestant? Y/N");
			String answer2 = scan.next();

			if (answer2.equalsIgnoreCase("Yes") || answer2.equalsIgnoreCase("Y")) {
				repeat = true;
			}
			else {
				repeat = false;
				}
		} while (repeat);
	}
	
	/** 
	* @param contestantAL, label1
	* Prints all contestant information
	*/
	public static void printLabels(ArrayList<ContestantInformation> contestantAL) {
		for (int i=0; i<contestantAL.size();i++) {
			Label label1 = new Label(contestantAL.get(i));
			System.out.println(label1.toString());
		}
	}
	
	/** 
	* @param contestantAL
	* Searches for a contestant based on last name
	*/
	public static void searchContestants(ArrayList<ContestantInformation> contestantAL) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Who do you want to search for? Input their last name.");
		String searchLastName = scan.nextLine();
			for (int i=0; i<contestantAL.size();i++) {
				if (searchLastName.equals(contestantAL.get(i).getLName())) {
					System.out.println("Match found!" + "\n" + contestantAL.get(i).getFName() + " " + contestantAL.get(i).getLName());
				}
				else {
					System.out.println("Sorry, that name hasn't been entered.");
				}
			}
			if (contestantAL.size() == 0) {
				System.out.println("There are currently no contestants in the database.");
			}
		}
	
	/** 
	* @param contestantAL
	* Deletes a single contestant whose last name matches the one input by the user
	*/
	public static void deleteContestant(ArrayList<ContestantInformation> contestantAL) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Who do you want to delete? Input their last name.");
		String searchLastName = scan.nextLine();
		for (int i=0; i<contestantAL.size();i++) {
			if (searchLastName.equals(contestantAL.get(i).getLName())) {
				System.out.println("Match found!" + "\n" + contestantAL.get(i).getFName() + " " + contestantAL.get(i).getLName());
				System.out.println("Is this the contestant you want to delete?");
				String delete = scan.nextLine();
				if (delete.equalsIgnoreCase("Yes") || delete.equalsIgnoreCase("Yes.") || delete.equalsIgnoreCase("Y")) {
				contestantAL.remove(i);	
				System.out.println("Contestant removed!");
				}
				else {
					System.out.println("Operation cancelled.");
				}
			}
			else {
				System.out.println("Sorry, we couldn't find that contestant.");
			}
		}
	}
	
	/** 
	* @param contestantAL
	* Deletes all contestants in contestantAL
	*/
	public static void deleteAll(ArrayList<ContestantInformation> contestantAL) {
		contestantAL.removeAll(contestantAL);
	}
	
	/** 
	* @param contestantAL, contestant1, fileOutputStream, fps
	* Saves all contestant information into contestants.txt
	*/
	public static void saveContestants(ArrayList<ContestantInformation> contestantAL) throws FileNotFoundException {
		ContestantInformation contestant1 = new ContestantInformation();
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("src\\carhart\\contestants.txt");
			PrintStream fps = new PrintStream(fileOutputStream);
			fps.println(contestantAL.size());
			for (int i=0; i<contestantAL.size(); i++) {
				fps.print(contestantAL.get(i).getFName() + "-");
				fps.print(contestantAL.get(i).getLName() + "-");
				fps.print(contestantAL.get(i).getStName() + "-");
				fps.print(contestantAL.get(i).getStNum() + "-");
				fps.print(contestantAL.get(i).getCity() + "-");
				fps.print(contestantAL.get(i).getProvince() + "-");
				fps.print(contestantAL.get(i).getPostalCode() + "-");
				fps.print(contestantAL.get(i).getPhoneNum() + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("All contestants saved!");
	}
	
	/** 
	* @param contestantAL, fbr
	* loads info saved in contestant.txt
	*/
	public static void loadContestants(ArrayList<ContestantInformation> contestantAL) throws FileNotFoundException, IOException, InvalidInputException, NullPointerException { 
		try {
			deleteAll(contestantAL);
			BufferedReader fbr = new BufferedReader(new FileReader("src\\carhart\\contestants.txt"));
			int size = Integer.parseInt(fbr.readLine());
			for (int i=0; i<size;i++) {
				String load = fbr.readLine();
				String[] loadArray = load.split("-");
				contestantAL.add(new ContestantInformation());
				contestantAL.get(i).setFName(loadArray[0]);
				contestantAL.get(i).setLName(loadArray[1]);
				contestantAL.get(i).setStName(loadArray[2]);
				contestantAL.get(i).setStNum(loadArray[3]);
				contestantAL.get(i).setCity(loadArray[4]);
				contestantAL.get(i).setProvince(loadArray[5]);
				contestantAL.get(i).setPostalCode(loadArray[6]);
				contestantAL.get(i).setPhoneNum(loadArray[7]);
		
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		  catch (NullPointerException f) {
			f.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	/** 
	* @param contestantAL
	* Sorts contestantAL into an ordered list
	*/
	public static void sortContestants(ArrayList<ContestantInformation> contestantAL) {
		Collections.sort(contestantAL);
		if (contestantAL.size() == 0) {
			System.out.println("Sorry, there aren't any contestants to sort!");
		}
	}
}
