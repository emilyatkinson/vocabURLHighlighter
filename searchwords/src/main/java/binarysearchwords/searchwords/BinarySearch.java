package binarysearchwords.searchwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearch {

	
//	public static void main(String[] args) {
//		ArrayList htmlAL = new ArrayList();
//		htmlAL.add("cat");
//		htmlAL.add("dog");
//		htmlAL.add("fish");
//		htmlAL.add("elephant");
//		
//		ArrayList<String> vR= new ArrayList();
//		vR.add("fish");
//		vR.add("dog");
//		
//		LinkedList foundIndex = binarySerach(htmlAL, vR);
//		
//		for (int i = 0; i < foundIndex.size(); i++) {
//			System.out.println(foundIndex.get(i));
//		}
//		
//
//	}

	public static LinkedList binarySerach(ArrayList htmlArrayList, ArrayList vocabReader) {
		ArrayList<String> arraylist = new ArrayList<String>();
		LinkedList wordsFoundIndex = new LinkedList();

		for (int i = 0; i < vocabReader.size(); i++) {
			String key =  vocabReader.get(i).toString(); //This is also it maybe
			int indexFromHtml = Collections.binarySearch(htmlArrayList, key);
			wordsFoundIndex.add(indexFromHtml);
		}
		return wordsFoundIndex;
	}
}
