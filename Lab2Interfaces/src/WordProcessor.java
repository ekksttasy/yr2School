/* WordProcessor class used to count various attributes of a given sentence.
 * 
 * Implements basic 'Counter' interface for ease of use. 
 * polymorphism slay
 * 
 * @author ekaufman
 */
public class WordProcessor implements Counter{
	
	String text;
	
	private String getText() {
		return text;
	}
	
	private void setText() {
		this.text = text;
	}
	
	@Override
	public int countWords(String sentence) {
		if (sentence == null) {
			String[] words = text.split(" ");
			int counter = words.length;
			return counter;
		} else {
			String[] words = sentence.split(" ");
			int counter = words.length;
			return counter;
		}
	}

	@Override
	public int countLetters(String sentence) {
		int counter = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isLetter(sentence.charAt(i)))
				counter++;
		}
		return counter;
	}

	@Override
	public int getLength(String sentence) {
		int counter = sentence.length();
		return counter;
	}

}
