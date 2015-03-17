package binarysearchwords.searchwords;

import java.util.ArrayList;
import java.util.HashSet;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MarkedUpHTML {
	
	public String markup(HashSet<String> matches, Document doc) { 
		
		String documentString = doc.toString(); 
		
		
		
		for (String matched : matches) {
			String highlightedWord = new StringBuilder().append("<mark>").append(matched).
					append("</mark>").toString();
			documentString = documentString.replaceAll(matched, highlightedWord);
		
		}
		return documentString;
}
}