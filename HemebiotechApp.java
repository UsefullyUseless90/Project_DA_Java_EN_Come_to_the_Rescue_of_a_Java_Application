package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HemebiotechApp {

	public static void main(String[] args) throws IOException {
		// Symptoms reading phase//

		List<String> mySymptomsList;
		Map<String, Long> symptomsCalculated;
		ISymptomReader reader = new ReadSymptomDataFromFile(
				"C:\\Users\\antco\\Desktop\\JAVA\\workspace\\root\\HemebiotechAnalytics\\Projet_java2--master\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt");
		AnalyticsCounter ac = new AnalyticsCounter(reader);
		FileCreater fc = new FileCreater() {
		};

		mySymptomsList = ac.readSymptoms();
		symptomsCalculated = ac.addingSymptoms(mySymptomsList);
		symptomsCalculated = ac.sortingSymptoms(symptomsCalculated);
		symptomsCalculated = FileCreater.writeSymptoms(symptomsCalculated);
	}
}

// *

//*