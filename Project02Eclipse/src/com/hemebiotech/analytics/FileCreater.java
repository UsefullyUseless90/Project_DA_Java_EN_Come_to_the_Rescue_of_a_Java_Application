package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public interface FileCreater {

	public static Map<String, Long> writeSymptoms(Map<String, Long> symptomsMapSorted) throws IOException {

		String symptoms2 = "result" + String.valueOf("Out.txt");
		FileWriter fstream = new FileWriter(symptoms2);
		BufferedWriter out = new BufferedWriter(fstream);

		for (Map.Entry<String, Long> entry : symptomsMapSorted.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue()); // that's the printed result by the App//

			try {
				out.write("\n" + entry.getKey() + " = " + entry.getValue()); // that organize the order in the
																				// file.txt//
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			out.flush();
		}

		out.close();
		return symptomsMapSorted;
	}
}
