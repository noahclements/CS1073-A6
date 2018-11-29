/**
	A class representing the many methods to changing cases
	@author Noah Clements 3585596
*/
import java.util.Scanner;
public class ChangeCase {
	/** the user input */
	private String input;
	/** char value for the user input */
	private char ch;
	/** the sentence that will be returned */
	private String newSentence = "";
	/** the boolean value to say whether its the end of a sentence */
	private boolean endOfSentence = false;
	/**
	The constructor method for ChangeCase
	@param inputIn the user input
	*/
	public ChangeCase(String inputIn) {
		input = inputIn;
	}
		/**
			converts the cases to all lower case
			@return the string with all lower case letters
		*/
		public String toLowerCase() {
			for(int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					ch += 32;
				} 
				newSentence += ch;
			}
			return newSentence;
		}
		/**
			converts the words to all upper case
			@return the string with all upper case words
		*/
		public String toUpperCase() {
			for(int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				if(ch >= 'a' && ch <= 'z') {
					ch -= 32;
				}
				newSentence += ch;
			}
			return newSentence;
		}
		/**
			converts it so that every word starts with a capital letter, the rest lower case
			@return the string with every word starting with a capital letter, all other letters lowercase
		*/
		public String toTitleCase() {
			for(int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				if(i == 0) {
					if(ch >= 'a' && ch <= 'z') {
						ch -= 32;
					} 
				} else if(ch == ' ') {
					i++;
					ch = input.charAt(i);
					if(i< input.length()) {
						if(ch >= 'a' && ch <= 'z') {
							ch -= 32;
						} 
					}
					newSentence += " ";
				} else if(ch >= 'A' && ch <= 'Z') {
					ch += 32;
				} 
				newSentence += ch;
			}			
		return newSentence;
	}

		/**
			converts all lowercase to upper case, and vice versa
			@return the string with all lowercase letters to upper, and vice versa
		*/
		public String toggleCase() {
		for(int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				if(ch >= 'a' && ch <= 'z') {
					ch -= 32;
				} else if(ch >= 'A' && ch <= 'Z') {
					ch += 32;
				}
				newSentence += ch;
			}
			return newSentence;
			
		}
		/**
			makes sure the first word in any sentence starts with a capital letter
			@return the string with the first word in the sentence starting with a capital letter, the rest lower case
		*/
		public String toSentenceCase() {
		 for(int i = 0; i < input.length(); i++) {
		 	ch = input.charAt(i);
		 	if(ch == '!' || ch == '?' || ch == '.') {
		 		endOfSentence = true;
		 	}

		 	if(i == 0 || endOfSentence == true) {
		 		if(ch >= 'A' && ch <= 'Z') {
		 			endOfSentence = false;
		 		} if(ch >= 'a' && ch <= 'z') {
		 			ch -= 32;
		 			endOfSentence = false;
		 		}
		 	} else if(ch >= 'A' && ch <= 'Z' && endOfSentence == false) {
		 		ch += 32;
		 	} 
		 	newSentence += ch;
		 }
		 	return newSentence;
		}




		




}