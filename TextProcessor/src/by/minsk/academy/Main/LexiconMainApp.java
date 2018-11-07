package by.minsk.academy.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import by.minsk.academy.Lexicon.Paragraph;

public class LexiconMainApp {

	public static void main(String[] args) throws IOException {
		try {
			Paragraph text=new Paragraph(new String(Files.readAllBytes(Paths.get("C://Users//Dude//Desktop//text.txt"))));
			System.out.println(text.getParagraph());
			text.sort();
			System.out.println(text.getParagraph());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
