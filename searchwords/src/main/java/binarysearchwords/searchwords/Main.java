package binarysearchwords.searchwords;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] arguments) throws IOException {
		

		
		URLReader urlreader = new URLReader();
		HTMLWordsArray htmlarray = new HTMLWordsArray();
		BinarySearchWordsArray binarysearch = new BinarySearchWordsArray();
		MarkedUpHTML muh = new MarkedUpHTML();
		
		String[] urlstringarray = urlreader.getUrlArray();
		
		int count = 1; 
		for (String urlstring : urlstringarray) {
			
			Document html = Jsoup.connect(urlstring).get();
			
			
			String[] HTMLArray = htmlarray.getHTMLArray(urlstring);

			HashSet<String> matchingWords = binarysearch
					.getMatchedWordsArray(HTMLArray);
			
			String markedUpDoc = muh.markup(matchingWords, html);
			
			
			WriteFile.writeToFile(urlstring, markedUpDoc, count);
			
			count++;
		}
	}
}

			

