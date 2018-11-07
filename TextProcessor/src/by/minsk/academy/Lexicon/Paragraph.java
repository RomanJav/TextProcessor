package by.minsk.academy.Lexicon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Paragraph {
	private List<Sentence> paragraph;

	public String getParagraph() {
		String paragraph = "";
		for (Sentence sentence : this.paragraph) {
			if (paragraph == "") {
				paragraph = sentence.getSentence();
			} else {
				paragraph = paragraph + " " + sentence.getSentence();
			}
		}
		return paragraph;
	}

	public void setParagraph(String text) {
		String[] sentenceHolder = text.trim().split("(?<=\\.\\s)|(?<=[?!]\\s)");
		this.paragraph = new ArrayList<Sentence>();
		for (String str : sentenceHolder) {
			this.paragraph.add(new Sentence(str));
		}
	}

	public Paragraph(String text) {
		setParagraph(text);
	}

	public void sentencesInParagraph() {
		for (Sentence sentence : paragraph) {
			System.out.println(sentence.getSentence());
		}
	}

	public void sort() {
		paragraph.sort((s1, s2) -> s1.getCountOfWords().compareTo(s2.getCountOfWords()));
	}
}
