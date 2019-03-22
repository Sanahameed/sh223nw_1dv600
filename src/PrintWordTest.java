import static org.junit.Assert.*;

import org.junit.Test;

public class PrintWordTest {

	@Test
	public void PrintWordTest() {
		Hangman test = new Hangman();
		String words = "Sanaa";
		char[] enteredLetters = new char[2];
		boolean result = test.printWord(words, enteredLetters);
		assertEquals(true,result);
	}

}
