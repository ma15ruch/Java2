import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import zen.core.Zen;


public class WordCloud {

	public static void main(String[] args) throws FileNotFoundException {
		Zen.create(800, 800);

		ArrayList<String> words = new ArrayList <String> ();
		HashMap <String, Integer> count = new HashMap <String, Integer> ();

		File f = new File("text");
		Scanner s = new Scanner(f);

		while(s.hasNext()){
			String word = s.next();
			word = word.toLowerCase();
			word = word.replaceAll("[^a-z]", "");
			words.add(word);
			if (count.containsKey(word)){
				int current = count.get(word);
				count.put(word,  current +1);
			}
			else{
				count.put(word,1);
			}
		}

		words.add("ruchi");
		words.add("divya");
		words.add("carrots");
		words.add("cheese");
		words.add("love");
		words.add("peace");
		words.add("happiness");


		for (String word: count.keySet()){
			if (count.get(word) > 10){
			Zen.setFont("Baskerville", count.get(word) / 10);
			Zen.setColor(Zen.getRandomNumber(50,250), Zen.getRandomNumber(50, 250), Zen.getRandomNumber(50, 250));
			Zen.drawText(word, Zen.getRandomNumber(0,800), Zen.getRandomNumber(0, 800));
			}
		}
	}

}
