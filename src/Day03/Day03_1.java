package Day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day03_1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day03/input_1"); 
		ArrayList<String> inputList = new ArrayList<String>();
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				
				String tmp = sc.nextLine();
				// don't ask :P
				tmp += tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp + tmp;
				inputList.add(tmp);
			}
		}
			
		int result = 0;
		
		// get length
		int length = 3;
		
		for (int i = 1; i < inputList.size(); i++) {

			if (inputList.get(i).charAt(i * length) == '#') {
				result++;
			}
		}
		
		System.out.println("Solution: " + result);
	}

}
