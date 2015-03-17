package binarysearchwords.searchwords;

import java.util.HashSet;
import org.jsoup.nodes.Document;

public class MarkedUpHTML {
	
	public String markup(HashSet<String> matches, Document doc) { 
		
		String documentString = doc.toString(); 
		
		for (String matched : matches) {
			String highlightedWord = new StringBuilder().append("<mark>").append(matched).
					append("</mark>").toString();
			String matchWord = new StringBuilder().append("\\b").append(matched).append("\\b").toString();  
			documentString = documentString.replaceAll(matchWord, highlightedWord);
			
		
		}
		return documentString;
	}
}
	