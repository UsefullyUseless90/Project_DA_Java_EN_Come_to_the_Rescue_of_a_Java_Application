package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface FileCreater {

	void writeSymptoms(Map<String, Long> symptomsMapSorted) throws IOException;

}
