package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileCreaterImpl implements FileCreater {

	private String writer;

	public FileCreaterImpl(String string) {
		this.writer = string;
	}

	@Override
	public Map<String, Long> writeSymptoms(Map<String, Long> symptomsMapSorted) throws IOException {

		FileWriter fstream = new FileWriter(this.writer);
		BufferedWriter out = new BufferedWriter(fstream);

		for (Map.Entry<String, Long> entry : symptomsMapSorted.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue()); // that's the printed result by the App//

			try {
				out.write("\n" + entry.getKey() + " = " + entry.getValue()); // that organize the order in the
																				// file.txt//
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			out.flush();
		}
		out.close();
		return symptomsMapSorted;
	}
}
