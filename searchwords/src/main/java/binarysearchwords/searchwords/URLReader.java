package binarysearchwords.searchwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class URLReader {

	public  String[] getUrlArray() {


		File file = new File("url.txt");
		String line = null;
		List<String> urlList = new ArrayList<String>();
		String[] urlStringArray = null;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((line = br.readLine()) != null) {
		            urlList.add(line);
		            urlStringArray = urlList.toArray(new String[0]); 
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());

		} catch (IOException e) {
			System.out.println("Unable to open file: " + file.toString());
		}
		return urlStringArray;
	}
	}

