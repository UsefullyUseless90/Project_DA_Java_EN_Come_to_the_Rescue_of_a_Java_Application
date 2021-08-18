package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AnalyticsCounter {
	private ISymptomReader isr;

	public AnalyticsCounter(ISymptomReader a) {
		this.isr = a;
	}

	public List<String> readSymptoms() {
		return this.isr.GetSymptoms();
	}

	// Calculate Occurrences//
	public Map<String, Long> addingSymptoms(List<String> symptoms) {
		Map<String, Long> counterSymptoms = new HashMap<String, Long>();

		if (symptoms != null) {
			for (String s : symptoms) {
				counterSymptoms.put(s, counterSymptoms.containsKey(s) ? counterSymptoms.get(s) + 1 : 1);
			}
			for (String key : counterSymptoms.keySet()) {

			}
		}
		return counterSymptoms;

	}

	// Sorting occurrences//
	public Map<String, Long> sortingSymptoms(Map<String, Long> orderSymptoms) {
		Map<String, Long> sortSymptoms = new TreeMap<String, Long>();

		sortSymptoms.putAll(orderSymptoms);

		Set set = sortSymptoms.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();

		}
		// Sorting occurrences//
		Map sortedMap = new TreeMap(sortSymptoms);

		Set set2 = sortedMap.entrySet();
		Iterator iterator2 = set2.iterator();

		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();

			return sortSymptoms;

		}

		return orderSymptoms;
	}

	public Map<String, Long> writeSymptoms(Map<String, Long> symptomsMapSorted) throws IOException {
		String symptoms2 = "result" + String.valueOf("Out.txt");
		FileWriter fstream = new FileWriter(symptoms2);
		BufferedWriter out = new BufferedWriter(fstream);

		for (Map.Entry<String, Long> entry : sortingSymptoms(symptomsMapSorted).entrySet()) {
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
