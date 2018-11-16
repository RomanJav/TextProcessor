package by.minsk.academy.Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

import by.minsk.academy.Lexicon.Paragraph;

public class LexiconMenu {
	private Paragraph text;

	public LexiconMenu(String path) throws IOException {
		try {
			this.text = new Paragraph(new String(Files.readAllBytes(Paths.get(path))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("Choise what to do: ");
			System.out.println("1. Show your text");
			System.out.println("2. Show text one Sentence per line");
			System.out.println("3. Sort text by the number of words in the sentence");
			System.out.println("4. Write new text in file");
			System.out.println("5. Exit");
			int choise = sc.nextInt();
			if (choise < 1 || choise > 5) {
				break;
			} else if (choise == 1) {
				showText();
			} else if (choise == 2) {
				showTextByDropSentences();
			} else if (choise == 3) {
				sortTextByWordsCount();
			} else if (choise == 4) {
				writeTextInNewFile();
			} else if (choise == 5) {
				b = false;
			}
		}
	}

	private void showText() {
		System.out.println(text.getParagraph());
	}

	private void showTextByDropSentences() {
		text.sentencesInParagraph();
	}

	private void sortTextByWordsCount() {
		text.sort();
	}

	private void writeTextInNewFile() {
		FileOutputStream os;
		try {
			os = new FileOutputStream("C://Users//Dude//Desktop//text2.txt");
			byte[] strToBytes = text.getParagraph().getBytes();
			os.write(strToBytes);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
