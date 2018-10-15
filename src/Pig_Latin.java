import java.util.Scanner;

public class Pig_Latin {

	public static boolean isVowel(char firstLetter) {
		if (firstLetter == 'A' || firstLetter == 'a' || firstLetter == 'E' || firstLetter == 'e' || firstLetter == 'I'
				|| firstLetter == 'i' || firstLetter == 'O' || firstLetter == 'o' || firstLetter == 'U'
				|| firstLetter == 'u') {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Pig Latin Converter!");
		System.out.println();

		Scanner scan = new Scanner(System.in);

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("What word would you like to convert to Pig Latin? ");
			String userInput = scan.next();
			userInput = userInput.toLowerCase(); // commenting out this line allows the word to keep its case as the
													// isVowel method testsfor both upper and lower case vowels

			System.out.println();
			System.out.println("Thanks. I think we can make it even better with Pig Latin!");
			System.out.println();

			char firstLetter = userInput.charAt(0); // String firstLetter = userInput.substring(0, 1);
			char secondLetter = userInput.charAt(1); // String secondLetter = userInput.substring(1, 2);
			char thirdLetter = userInput.charAt(2); // String thirdLetter = userInput.substring(2, 3);

			String firstTwoLetters = userInput.substring(0, 2);
			String firstThreeLetters = userInput.substring(0, 3);

			String pigLatin;

			// tests if the first letter is a vowel and modifies the word accordingly
			if (isVowel(firstLetter)) {
				pigLatin = userInput.concat("way");
				System.out.println(pigLatin);
			}
			// tests if the 1st and 3rd letters are consonants and the 2nd is a vowel
			// and modifies the word accordingly
			else if (!isVowel(firstLetter) && (isVowel(secondLetter)) && (!isVowel(thirdLetter))) {
				pigLatin = userInput.substring(1) + firstLetter + "ay";
				System.out.println(pigLatin);
			}

			// tests if the first two letters are consonants and the third is a vowel
			// and modifies the word accordingly
			else if ((!isVowel(firstLetter)) && (!isVowel(secondLetter)) && (isVowel(thirdLetter))) {
				pigLatin = userInput.substring(2) + firstTwoLetters + "ay";
				System.out.println(pigLatin);
			}

			// tests if the first three letters are consonants and modifies the word
			// accordingly
			else if ((!isVowel(firstLetter)) && (!isVowel(secondLetter)) && (!isVowel(thirdLetter))) {
				pigLatin = userInput.substring(3) + firstThreeLetters + "ay";
				System.out.println(pigLatin);
			}
			
			System.out.println();
			System.out.println("Continue? (y/n)");
			cont = scan.next();
			System.out.println();
		}
		System.out.println("Thanks for playing!");
		scan.close();
	}
}
