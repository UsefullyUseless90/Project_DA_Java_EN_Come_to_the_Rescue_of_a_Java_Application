package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HemebiotechApp {

	public static void main(String[] args) throws IOException {
		// Symptoms reading phase//

		List<String> mySymptomsList;
		Map<String, Long> symptomsCalculated;
		String symptoms2 = "result" + String.valueOf("Out.txt");
		FileWriter fstream = new FileWriter(symptoms2);
		BufferedWriter out = new BufferedWriter(fstream);
		ISymptomReader reader = new ReadSymptomDataFromFile(
				"C:\\Users\\antco\\Desktop\\JAVA\\workspace\\root\\HemebiotechAnalytics\\Projet_java2--master\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt");

		AnalyticsCounter ac = new AnalyticsCounter(reader);

		mySymptomsList = ac.readSymptoms();
		symptomsCalculated = ac.addingSymptoms(mySymptomsList);
		symptomsCalculated = ac.sortingSymptoms(symptomsCalculated);

		for (Map.Entry<String, Long> entry : symptomsCalculated.entrySet()) {
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
	}
}

// *

//*