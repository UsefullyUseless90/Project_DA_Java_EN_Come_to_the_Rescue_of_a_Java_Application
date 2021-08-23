package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface FileCreater {

	Map<String, Long> writeSymptoms(Map<String, Long> symptomsMapSorted) throws IOException;

}
