package com.blueoptima.worksample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Helper {

	public static String FILENAME = "Input.txt";
	
	/**
	 * This method will parse the input <br>
	 * It will read all the file names and then add them to list and return the list
	 * @return list of fileNames
	 */
	public static List<String> parseInput()
	{
		List<String> inputList;		
		File file = new File(FILENAME);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(FILENAME
					+ " doesn't exist. Please provide input on console.\n");
			scanner = new Scanner(System.in);
		}
		inputList =  Arrays.asList((scanner.nextLine().split(" ")));
		scanner.close();
		return inputList;
	}
	
}
