package binarysearchwords.searchwords;
import java.util.*; 

public class BinarySearchWordsArray {

	public HashSet<String> getMatchedWordsArray(String[] array) { //array you want to use values of as key
		
		HashSet<String> matchedWords = new HashSet<String>();
		
		String[] wordsArray = VocabReader.populateArray();
		Arrays.sort(wordsArray);
		
		for (int i = 0; i < array.length; i++) {
			String word = array[i]; 
			
			int ret = Arrays.binarySearch(wordsArray, array[i]); 
			
			if (ret > 0) { 
				matchedWords.add(word);
				
			}
		}
		return matchedWords;
	}
}


