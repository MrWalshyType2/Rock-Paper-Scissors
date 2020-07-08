package com.qa.rps.utils;

import java.util.Scanner;

public class Utilities {
	public static final Scanner s = new Scanner(System.in);

	public Utilities() {

	}

	public static String getInput() {
		return s.nextLine();
	}
}
