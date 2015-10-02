package carhart;

public class Label {
	
	private ContestantInformation ci1;
	private String output;

	public Label(ContestantInformation ci) {
		this.ci1 = ci;
		formatName();
		formatAddress();
		formatNumber();
		
	}
	
	private void formatName() {
		this.output = ci1.getLName() + ", " + ci1.getFName() + "\n";
	}
	
	private void formatAddress() {
		this.output = output + ci1.getStNum() + " " + ci1.getStName() + "\n" + ci1.getCity() + ", " + ci1.getProvince() + "\n" + ci1.getPostalCode() + "\n";
	}

	private void formatNumber() {
		this.output = output + ci1.getPhoneNum();
	}
	public String toString() {
		return output;
		
		

	}
	
}

