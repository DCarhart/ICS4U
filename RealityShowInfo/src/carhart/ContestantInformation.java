package carhart;

/**
 * This program will set and return the first name, last name, street name, street number, city, province, postal code, phone number and date of birth
 * @author David Carhart, 322084039
 *
 */
public class ContestantInformation implements Comparable {
	private String firstName;
	private String lastName;
	private String streetName;
	private String streetNum;
	private String city;
	private String province;
	private String postalCode;
	private String phoneNum;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	
	/**
	 * Empty ContestantInformation method
	 */
	public ContestantInformation() {
		
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param streetName
	 * @param streetNum
	 * @param city
	 * @param province
	 * @param postalCode
	 * @param phoneNum
	 * @param birthDate
	 * @param birthMonth
	 * @param birthYear
	 */
	public ContestantInformation(String firstName, String lastName, String streetName, String streetNum, String city, String province, String postalCode, String phoneNum, int birthDay, int birthMonth, int birthYear)  throws InvalidInputException {
		this.setFName(firstName);
		this.setLName(lastName);
		this.setStName(streetName);
		this.setStNum(streetNum);
		this.setCity(city);
		this.setProvince(province);
		this.setPostalCode(postalCode);
		this.setPhoneNum(phoneNum);
		this.setDoB(birthDay);
		this.setMoB(birthMonth);
		this.setYoB(birthYear);
	}
	/**
	* @param firstName set the first name 
	*/
	public void setFName(String firstName) throws InvalidInputException {
		if (firstName.isEmpty()) {
			throw new InvalidInputException("Please enter a name.");
		}
		for (int i=0; i<firstName.length();i++) {
			if (!Character.isLetter(firstName.charAt(i))) {
			throw new InvalidInputException("That's not a valid name. Try again.");
			}
			else {
			this.firstName = firstName;
			}
		}
		firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1).toLowerCase(); 
		this.firstName = firstName;
	}
	/**
	 * 
	 * @return firstName to get the first name
	 */
	public String getFName() {
		
		return this.firstName;
	}
	
	/**
	* @param lastName set the last name 
	*/
	public void setLName(String lastName) throws InvalidInputException {
		if (lastName.isEmpty()) {
			throw new InvalidInputException("Please enter a last name.");
		}
		for (int i=0; i<lastName.length();i++) {
			if (!Character.isLetter(lastName.charAt(i))) {
			throw new InvalidInputException("Not a valid name. Try again.");
			}
			/*else if(!Character.isWhitespace(firstName.charAt(i))){
			throw new InvalidInputException("No spaces in the first name.");
			}
			*/
			else {
			this.lastName = lastName;
			}
		}
		lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase(); 
		
		this.lastName = lastName;
	}
	/**
	 * 
	 * @return lastName to get the last name
	 */
	public String getLName() {
		return this.lastName;
	}
	
	/**
	* @param streetName set the street name 
	*/
	public void setStName(String streetName) throws InvalidInputException {
		if (streetName.isEmpty()) {
			throw new InvalidInputException("Please enter a street name.");
		}
		streetName = Character.toUpperCase(streetName.charAt(0)) + streetName.substring(1).toLowerCase();
		this.streetName = streetName;
	}
	/**
	 * 
	 * @return streetName to get the street name
	 */
	public String getStName() {
		return this.streetName;
	}
	/**
	* @param streetNum set the street number
	*/
	public void setStNum(String streetNum) throws InvalidInputException {
		if (streetNum.isEmpty()) {
			throw new InvalidInputException("Please enter a house or apartment number.");
		}
		this.streetNum = streetNum;
	}
	/**
	 * 
	 * @return streetNum to get the street number
	 */
	public String getStNum() {
		return this.streetNum;
	}
	
	/**
	* @param city set the city  
	*/
	public void setCity(String city) throws InvalidInputException {
		for (int i=0; i<city.length();i++) {
			if (!Character.isLetter(city.charAt(i))) {
			throw new InvalidInputException("Cities don't have numbers in this country. Try again.");
			}
		}
		if (city.isEmpty()) {
			throw new InvalidInputException("Please enter a city.");
		}
		city = Character.toUpperCase(city.charAt(0)) + city.substring(1).toLowerCase(); 
		this.city = city;
	}
	/**
	 * 
	 * @return city to get the city
	 */
	public String getCity() {
		return this.city;
	}
	
	/**
	* @param province set the province
	*/
	public void setProvince(String province) throws InvalidInputException {
		if (province.isEmpty()) {
			throw new InvalidInputException("Please enter a province.");
		}
		for (int i=0; i<province.length();i++) {
			if (!Character.isLetter(province.charAt(i))) {
			throw new InvalidInputException("Invalid province.");
			}
			if (province.equalsIgnoreCase("Ontario") || province.equalsIgnoreCase("ON")) {
				this.province = "ON";
			}
			else if (province.equalsIgnoreCase("Quebec") || province.equalsIgnoreCase("QC")) {
				this.province = "QC";
			}
			else if (province.equalsIgnoreCase("British Columbia") || province.equalsIgnoreCase("BC")) {
				this.province = "BC";
			}
			else if (province.equalsIgnoreCase("Alberta") || province.equalsIgnoreCase("AB")) {
				this.province = "AB";
			}
			else if (province.equalsIgnoreCase("Nova Scotia") || province.equalsIgnoreCase("NS")) {
				this.province = "NS";
			}
			else if (province.equalsIgnoreCase("New Brunswich") || province.equalsIgnoreCase("NB")) {
				this.province = "NB";
			}
			else if (province.equalsIgnoreCase("Manitoba") || province.equalsIgnoreCase("MB")) {
				this.province = "MB";
			}
			else if (province.equalsIgnoreCase("Newfoundland and Labrador") || province.equalsIgnoreCase("NL") || province.equalsIgnoreCase("Newfoundland & Labrador")) {
				this.province = "NL";
			}
			else if (province.equalsIgnoreCase("Prince Edward Island") || province.equalsIgnoreCase("PEI")) {
				this.province = "PEI";
			}
			else if (province.equalsIgnoreCase("Saskatchewan") || province.equalsIgnoreCase("SK")) {
				this.province = "SK";
			}
			else if (province.equalsIgnoreCase("Northwest Territories") || province.equalsIgnoreCase("NT")) {
				this.province = "NT";
			}
			else if (province.equalsIgnoreCase("Yukon") || province.equalsIgnoreCase("YK")) {
				this.province = "YK";
			}
			else if (province.equalsIgnoreCase("Nunavut") || province.equalsIgnoreCase("NU")) {
				this.province = "NU";
			}
			else {
				throw new InvalidInputException("Invalid province.");
			}
		}
/*		String[] provinceList = new String[] {"Ontario", "Quebec", "British Columbia", "Alberta", "Nova Scotia", "Manitoba", "Newfoundland and Labrador", "Prince Edward Island", "Saskatchewan", "New Brunswich", "Northwest Territories", "Yukon", "Nunavut", "ON", "QC", "NS", "NB", "MB", "BC", "PEI", "PE", "SK", "AB", "NL", "Newfoundland & Labrador"}; 
		for (int i=0; i<provinceList.length; i++) {
			if (province.equalsIgnoreCase(provinceList[i])) {
				this.province = province;
				province = Character.toUpperCase(province.charAt(0)) + province.substring(1).toLowerCase();
				return;
			}
		}
		throw new InvalidInputException("Invalid province.");
*/			
	}
	/**
	 * 
	 * @return province to get the province
	 */
	public String getProvince() {
		return this.province;
	}
	
	/**
	* @param postalCode set the postal code 
	* @throws InvalidInputException
	*/
	public void setPostalCode(String postalCode) throws InvalidInputException {
		if (postalCode.length() > 6)
		{
			throw new InvalidInputException("Postal Code is too long; must be 6 digits.");
		}
		else if (postalCode.length() < 6) 
		{
			throw new InvalidInputException("Postal Code is too short; must be 6 digits.");
		}
		for (int i=1; i<=5;i+=2) {
			if (!Character.isDigit(postalCode.charAt(i))) {
			throw new InvalidInputException("Invalid postal code.");	
			}
		}
		for (int i=0; i<=4;i+=2) {
			if (!Character.isLetter(postalCode.charAt(i))) {
			throw new InvalidInputException("Invalid postal code.");
			}
		}
		this.postalCode = postalCode;
	}
	/**
	 * 
	 * @return postalCode to get the postal code
	 */
	public String getPostalCode() {
		return this.postalCode;
	}
	
	/**
	* @param phoneNum set the phone number
	*/
	public void setPhoneNum(String phoneNum) throws InvalidInputException{
		if (phoneNum.length() > 10) {
			throw new InvalidInputException("Phone number is too long.");
		}
		else if (phoneNum.length() < 10) {
			throw new InvalidInputException("Phone number is too short.");
		}
		for (int i=0; i<phoneNum.length();i++) {
			if (!Character.isDigit(phoneNum.charAt(i))) {
			throw new InvalidInputException("Invalid phone number.");	
			}
		}
		this.phoneNum = phoneNum;
	}
	/**
	 * 
	 * @return phoneNum to get the phone number
	 */
	public String getPhoneNum() {
		return this.phoneNum;
	}
	
	/**
	* @param birthDay set the birth day
	*/
	public void setDoB(int birthDay) throws InvalidInputException {
		this.birthDay = birthDay;
	}
	/**
	 * 
	 * @return birthDay to get the day of birth
	 */
	public int getDoB() {
		return this.birthDay;
	}
	/**
	* @param birthMonth set the birth month
	*/
	public void setMoB (int birthMonth) throws InvalidInputException {
		this.birthMonth = birthMonth;
	}
	/**
	 * 
	 * @return birthMonth to get the month of birth
	 */

	public int getMoB() {
		return this.birthMonth;
	}
	
	/**
	* @param birthYear set the birth year
	*/
	
	public void setYoB (int birthYear) throws InvalidInputException {
		this.birthYear = birthYear;
		if (birthYear > 97) {
			throw new InvalidInputException ("You must be 18 or over to enter.");
		}
	}
	/**
	 * 
	 * @return birthYear to get the year of birth
	 */
	
	public int getYoB() {
		return this.birthYear;
	}
	/**
	 * print off relevant information
	 */
	public String toString() {
		return firstName + " " + lastName + " " + streetName + " " + streetNum + " " + city + " " + province + " " + postalCode + " " + phoneNum + " " + birthDay + birthMonth + birthYear;
		
	}
	
	public int compareTo(Object args) {
		ContestantInformation ci = (ContestantInformation)args;
		if (ci.lastName.compareTo(this.lastName) < 0) {
			return -1;
		}
		else if (ci.lastName.compareTo(this.lastName) > 0) {
			return -1;
		}
		else //if (ci.lastName.compareTo(this.lastName) == 0)
			{
			if (ci.firstName.compareTo(this.firstName) > 0) {
				return -1;
			}
			else if (ci.firstName.compareTo(this.firstName) < 0) {
				return -1; 
			}
			else //if (ci.firstName.compareTo(this.firstName) == 0) 
				{
				return 0;
			}
		}
	} 
	
	public boolean equals(ContestantInformation ci) {
		if (ci.firstName.equalsIgnoreCase(this.firstName) && ci.lastName.equalsIgnoreCase(this.lastName)) {
			return true;	
		}
		else {
		return false;
		}
	}
}

