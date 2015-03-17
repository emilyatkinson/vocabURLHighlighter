package binarysearchwords.searchwords;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	BinarySearch binarySearch = new BinarySearch();

	static String[] array = { "bear", "bird", "cat", "dog", "fish", "koala",
			"lion", "tiger", "turtle", "zebra" };
	ArrayList<String> arrayList = new ArrayList<String>();

	static String[] queries = { "cat", "lion", "koala", "tiger", "zebra",
			"bear", "dolphin", "eagle", "rat" };
	ArrayList<String> querylist = new ArrayList<String>();
	LinkedList index = new LinkedList();

	LinkedList<Integer> dex = new LinkedList();

	@Before
	public void initialize() {
		for (int i = 0; i < queries.length; i++) {
			querylist.add(queries[i]);
		}
	}

	@Test
	public void binarySearchForBearEqualsIndexFive() {
		arrayList.add(array[0]);
		index = binarySearch.binarySerach(arrayList, querylist);
		assertEquals(0, index.get(5));
	}

	@Test
	public void binarySearchForKoalaEqualsIndexTwo() {
		arrayList.add(array[5]);
		index = binarySearch.binarySerach(arrayList, querylist);
		assertEquals(0, index.get(2));
	}

}
