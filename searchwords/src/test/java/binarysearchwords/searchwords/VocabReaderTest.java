package binarysearchwords.searchwords;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import main.VocabReader;

public class VocabReaderTest {
	private VocabReader vocabReader = null;

	@Before
	public void initialize() {
		vocabReader = new VocabReader();
	}

	@Test
	public void ArrayIsNotEmptyAfterPopulaton() {
		vocabReader.populateArray();

		assertNotNull(vocabReader.wordsArray);
	}

	@Test
	public void firstWordShouldBeInWordsArray() {
		Scanner scanner = vocabReader.openFileForReading();
		String actual = vocabReader.readWord(scanner);

		assertEquals("abase", actual);
	}

	@Test
	public void lastWordShouldBeInWordsArray() {
		vocabReader.populateArray();
		String actual = vocabReader.wordsArray[vocabReader.wordsArray.length - 1];

		assertEquals("zygotes", actual);

	}
}

/*
 * Something to make sure if file does not exist code does not
 * execute/FileNotFoundException
 */
