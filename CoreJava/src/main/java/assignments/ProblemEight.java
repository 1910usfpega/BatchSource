//Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.
//“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

package assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class ProblemEight {
	
	public static int i = 0;
	
	public static void isPalindrome() {
		
		//Putting the set of words in an arraylist
		ArrayList<String> words = new ArrayList<>();
		words.add("karan");
		words.add("madam");
		words.add("tom");
		words.add("civic");
		words.add("radar");
		words.add("jimmy");
		words.add("kayak");
		words.add("john");
		words.add("refer");
		words.add("billy");
		words.add("did");
		
		//Displaying the set of words after
		System.out.println("Words stored in the array list");
		System.out.println(words);
		
		//Creating a new array list to store palindrome words
		ArrayList<String> store = new ArrayList<>();
		
		//Iterate through each words
		ListIterator<String> iterator = words.listIterator();
		while(iterator.hasNext()) {
			char[] cArray = iterator.next().toCharArray();
			i = 0;
			while((cArray.length - i - 1) > 0) {
				
				//If the character doesn't match, break and move to next word
				if(!(cArray[i] == cArray[cArray.length - i - 1])) { 
					break;
				} 
				
				//If incremented all the way to the middle of the word and character stil match, store in new array list
				if((cArray.length - i - 1) == i) {
					String string = String.copyValueOf(cArray);
					store.add(string);
				}
				i++;
			}
		}
		//Print out new array list with palindromes
		System.out.println("\nPalindromes stored in a new array");
		System.out.print(store);
	}
}
