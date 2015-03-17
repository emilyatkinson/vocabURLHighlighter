package binarysearchwords.searchwords;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.*;
import org.jsoup.nodes.Document;

public class HTMLWordsArray {
		
	public String[] getHTMLArray(String url) throws IOException { 
		
		String[] htmlArray;  
		
		Document doc = Jsoup.connect(url).get();
		String contents = doc.html();

		contents = contents.toLowerCase(); 
		contents = contents.replaceAll("[^a-z]", " ").trim();  
		
		List<String> htmlList = Arrays.asList(contents.split("\\s+")); 	
		htmlArray = htmlList.toArray(new String[0]);
		
		return htmlArray; 
		
			}

	} 

