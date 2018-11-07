package by.minsk.academy.Lexicon;

public class Symbol {

	private char symbol;

	public char getSymbol() {
		return symbol;
	}

	private void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	protected Symbol(char symbol) {
		setSymbol(symbol);
	}
	
}
