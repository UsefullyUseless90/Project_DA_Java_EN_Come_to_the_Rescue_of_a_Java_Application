package com.hemebiotech.analytics;

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

}
