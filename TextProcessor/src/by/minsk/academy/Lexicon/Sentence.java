package by.minsk.academy.Lexicon;

import java.util.ArrayList;

import java.util.List;

public class Sentence {
	private List<Word> sentence;

	public String getSentence() {
		String sentence = "";
		for (Word word : this.sentence) {
			if (sentence == "") {
				sentence = word.getWord();
			}
			else {
				sentence = sentence + " " + word.getWord();
			}
		}
		return sentence;
	}

	public void setSentence(String paragraph) {
		String[] listWords = paragraph.replaceAll("\\.", ". ").split("\\s+");
		this.sentence = new ArrayList<Word>();
		for (String str : listWords) {
			this.sentence.add(new Word(str.trim()));
		}
	}

	public Sentence(String paragraph) {
		setSentence(paragraph);
	}
	
	public Integer getCountOfWords() {
		int wordCounter=0;
		for (Word word : sentence) {
			wordCounter++;
		}
		return wordCounter;
	}
	

}
