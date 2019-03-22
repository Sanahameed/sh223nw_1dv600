import static org.junit.Assert.*;

import org.junit.Test;

public class EnterLetterTest {

	@Test
	public void EnterLetterTest() {
		Hangman test = new Hangman();
		String words = "Sanaa";
		char[] enteredLetters = new char[2];
		System.out.print("Testing word is:-"+words+" and any letter of this word \n");
		int result = test.enterLetter(words, enteredLetters);
		assertEquals(1,result);
	}

}
