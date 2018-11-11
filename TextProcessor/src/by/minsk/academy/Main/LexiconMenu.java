package by.minsk.academy.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import by.minsk.academy.Lexicon.Paragraph;

public class LexiconMenu {
	Paragraph text;

	public LexiconMenu(String path)throws IOException {
		try {
			this.text=new Paragraph(new String(Files.readAllBytes(Paths.get(path))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void showText() {
		System.out.println(text.getParagraph());
	}
	public void showTextByDropSentences() {
		text.sentencesInParagraph();
	}
	public void sortTextByWordsCount() {
		text.sort();
	}
	
	
}
