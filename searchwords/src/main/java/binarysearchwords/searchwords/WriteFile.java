package binarysearchwords.searchwords;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.nodes.Document;

public class WriteFile {

	public static void writeToFile(String urlString, String doc, int count) {

//String uniquefileName = ("/Users/Atkinson/Documents/" + urlString + ".html");
String n = Integer.toString(count); 

try (BufferedWriter writer = new BufferedWriter(new FileWriter(
		n + "file.html"))) {
	writer.write(doc);
	writer.close();
} catch (IOException e) {
	System.out.println("Unable to open file: "
			+ urlString);
}
}
}