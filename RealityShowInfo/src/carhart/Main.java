package carhart;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		ArrayList<ContestantInformation> contestantAL = new ArrayList<ContestantInformation>();
		boolean repeat = true;
		do {
			ContestantInformation contestant1 = new ContestantInformation();
			boolean flag = false;
			Scanner scan = new Scanner(System.in);
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
				for (int i=0; i<contestantAL.size();i++) {
					Label label1 = new Label(contestantAL.get(i));
					System.out.println(label1.toString());
					repeat = false;
				}
			}
		} while (repeat);
	}

}
