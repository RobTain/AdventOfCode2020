package Day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day04/input_1");
		ArrayList<String> inputList = new ArrayList<String>();

		String input = "";
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				String tmp = sc.nextLine();

				if (tmp.equals("")) {
					inputList.add(input);
					input = "";
				} else {
					input += tmp + " ";
				}
			}
		}
		inputList.add(input);
		
		int result = 0;
		for (String string : inputList) {
			System.out.println(string);
			EntityDay04 entity = new EntityDay04();

			String[] split = string.split(" ");
			for (String s : split) {
				if (s.contains("ecl")) {
					entity.setEyeColor(s.split(":")[1]);
				} else if (s.contains("pid")) {
					entity.setPasspordID(s.split(":")[1]);
				} else if (s.contains("eyr")) {
					entity.setExpirationYear(s.split(":")[1]);
				} else if (s.contains("hcl")) {
					entity.setHairColor(s.split(":")[1]);
				} else if (s.contains("byr")) {
					entity.setBirthYear(s.split(":")[1]);
				} else if (s.contains("iyr")) {
					entity.setIssueYear(s.split(":")[1]);
				} else if (s.contains("cid")) {
					entity.setCountryID(s.split(":")[1]);
				} else if (s.contains("hgt")) {
					entity.setHeight(s.split(":")[1]);
				} 	
			}
			
			if (entity.countErrors() == 0) {
				result++;
			}
		}

		System.out.println("Solution: " + result);
	}

}

class EntityDay04 {
	@Override
	public String toString() {
		return "EntityDay04 [birthYear=" + birthYear + ", issueYear=" + issueYear + ", expirationYear=" + expirationYear
				+ ", height=" + height + ", hairColor=" + hairColor + ", eyeColor=" + eyeColor + ", passpordID="
				+ passpordID + ", countryID=" + countryID + "]";
	}

	private String birthYear;
	private String issueYear;
	private String expirationYear;
	private String height;
	private String hairColor;
	private String eyeColor;
	private String passpordID;
	private String countryID;



	public int countErrors() {
		int count = 0;

		if (getBirthYear() == null) {
			count++;
		} 

		if (getIssueYear() == null) {
			count++;
		} 
		
		if (getExpirationYear() == null) {
			count++;
		} 

		if (getHeight() == null) {
			count++;
		} 
		

		if (getPasspordID() == null) {
			count++;
		}

		if (getHairColor() == null) {
			count++;
		} 

		if (getEyeColor() == null) {
			count++;
		}
		return count;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(String issueYear) {
		this.issueYear = issueYear;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getPasspordID() {
		return passpordID;
	}
	
	public void setPasspordID(String passpordID) {
		this.passpordID = passpordID;
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}
}
