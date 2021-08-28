package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HemebiotechApp {

	public static void main(String[] args) throws IOException {
		// Symptoms reading phase//

		List<String> mySymptomsList;
		Map<String, Long> symptomsCalculated;

		ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		FileCreater writer = new FileCreaterImpl("Project02Eclipse/resultOut.txt");
		AnalyticsCounter ac = new AnalyticsCounter(reader, writer);

		mySymptomsList = ac.readSymptoms();
		symptomsCalculated = ac.addingSymptoms(mySymptomsList);
		symptomsCalculated = ac.sortingSymptoms(symptomsCalculated);
		ac.writeSymptoms(symptomsCalculated);

	}
}

// *

//*