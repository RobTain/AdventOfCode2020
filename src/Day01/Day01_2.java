package Day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01_2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/day01/input_1"); 
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				list.add(Integer.parseInt(sc.nextLine()));
			}
		}
		
		int result = 0;
		
		for (Integer integer : list) {
			for (Integer integer2 : list) {
				for (Integer integer3 : list) {
					if (integer + integer2 + integer3 == 2020) {
						result = integer * integer2 * integer3;
					}
				}
			}
		}
		
		System.out.println("Solution: " + result);
	}

}
