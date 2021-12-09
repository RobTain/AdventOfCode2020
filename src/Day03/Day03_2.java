package Day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day03/input_1"); 
		ArrayList<String> inputList = new ArrayList<String>();
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				
				String tmp = sc.nextLine();
				// don't ask :P
				tmp += tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp;
				inputList.add(tmp);
			}
		}
			
		long result1 = 0, result3 = 0, result5 = 0, result7 = 0, result1o2 = 0;
		
		// get length
		
		for (int i = 1; i < inputList.size(); i++) {
			
			if (inputList.get(i).charAt(i) == '#') {
				result1++;
			}

			if (inputList.get(i).charAt(i * 3) == '#') {
				result3++;
			}
			
			if (inputList.get(i).charAt(i * 5) == '#') {
				result5++;
			}
			
			if (inputList.get(i).charAt(i * 7) == '#') {
				result7++;
			}
			
			if (i % 2 == 0) {
				if (inputList.get(i).charAt(i/2) == '#') {
					result1o2++;
				}

			}
		}
		
		System.out.println("Solution: " + (result1 * result3 * result5 * result7 * result1o2));
	}

}
