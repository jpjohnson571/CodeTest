package com.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SentenceInput {

	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
		} catch (IOException e){
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}

}
