package com.java.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Sort the content of the given file.
 * @author rgunasekaran1
 *
 */
public class SortContentOfFile {

	public static void main(String[] args) throws IOException {
		ArrayList<String> rows = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("/Users/rgunasekaran1/Desktop/logs/input.txt"));
		
		String s;
		while ((s = reader.readLine()) != null)
			rows.add(s);

		Collections.sort(rows);

		FileWriter writer = new FileWriter("/Users/rgunasekaran1/Desktop/logs/output.txt");
		for (String cur : rows)
			writer.write(cur + "\n");

		reader.close();
		writer.close();

	}

}
