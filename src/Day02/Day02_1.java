package Day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day02_1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day02/input_1"); 
		ArrayList<String> inputList = new ArrayList<String>();
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				inputList.add(sc.nextLine());
			}
		}
		
		int result = 0;
		
		for (String string : inputList) {
			int count = 0;
			String validation = string.split(": ")[0];
			
			char check = validation.split(" ")[1].charAt(0);
			String password = string.split(": ")[1];
			for (int i = 0; i < password.length(); i++) {
				if (check == password.charAt(i)) {
					count++;
				}
			}
			int min = Integer.parseInt(validation.split("-")[0]);
			int max = Integer.parseInt(validation.split("-")[1].split(" ")[0]);
			if (count >= min && count <= max) {
				result++;
			}
 		}
		
		System.out.println("Solution: " + result);
	}

}
