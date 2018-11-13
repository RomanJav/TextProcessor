package by.minsk.academy.Lexicon;

public class Word {

	private String word;
	private Symbol symbol;

	public String getWord() {
		return word;
	}

	public char getSymbol() {
		return symbol.getSymbol();
	}

	private void setWord(String word) {
		char[] wordArray = word.toCharArray();
		if (wordArray[wordArray.length - 1] == ',' || wordArray[wordArray.length - 1] == '.'
				|| wordArray[wordArray.length - 1] == ':' || wordArray[wordArray.length - 1] == ';'
				|| wordArray[wordArray.length - 1] == '?' || wordArray[wordArray.length - 1] == '!') {
			this.symbol = new Symbol(wordArray[wordArray.length - 1]);
			char[] newWordArray = new char[wordArray.length - 1];
			for (int i = 0; i < wordArray.length - 1; i++) {
				newWordArray[i] = wordArray[i];
			}
			this.word = String.copyValueOf(newWordArray);
		} else {
			this.word = word;
			this.symbol = new Symbol(' ');
		}
	}

	public Word(String word) {
		setWord(word);
	}

}
