import static org.junit.Assert.*;

import org.junit.Test;

public class FindEmptyPositionTest {

	@Test
	public void FindEmptyPositionTest() {
		Hangman test = new Hangman();
		char[] enteredLetters = new char[5];
		enteredLetters[0] = 's';
		enteredLetters[2] = 'a';
		enteredLetters[3] = 'n';
		enteredLetters[4] = 'a';
		int result = test.findEmptyPosition(enteredLetters);
		assertEquals(1,result);
	}
}
