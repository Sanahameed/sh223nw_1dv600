import static org.junit.Assert.*;

import org.junit.Test;

public class InEnteredLettersTest {

	@Test
	public void InEnteredLettersTest() {
		Hangman test = new Hangman();
		char letter = 's';
		char[] enteredLetters = new char[5];
		enteredLetters[0] = 's';
		enteredLetters[1] = 'a';
		enteredLetters[2] = 'n';
		enteredLetters[3] = 'a';
		enteredLetters[4] = 'a';
		boolean result = test.inEnteredLetters(letter, enteredLetters);
		assertEquals(true,result);
	}

}
