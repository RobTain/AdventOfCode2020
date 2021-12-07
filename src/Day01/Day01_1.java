package Day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01_1 {
	
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
			if (list.contains(2020-integer)) {
				result = integer * (2020-integer);
			}
		}
		
		System.out.println("Solution: " + result);
	}

}
