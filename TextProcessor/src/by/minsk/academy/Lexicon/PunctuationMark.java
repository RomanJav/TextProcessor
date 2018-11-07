package by.minsk.academy.Lexicon;

public class PunctuationMark extends Symbol {
	private boolean mark;

	protected PunctuationMark(char symbol) {
		super(symbol);
		if (symbol == '.' || symbol == '!' || symbol == '?') {
			this.mark = true;
		}
	}

}
