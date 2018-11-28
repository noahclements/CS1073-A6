import java.util.Scanner;
public class ChangeCase {
	private String input;
	private char temp;
	private int counter = 0;
	private char test;
	private String newSentence = "";

	public ChangeCase(String inputIn) {
		input = inputIn;
	}

		public String toLowerCase() {
			for(int i = 0; i < input.length(); i++) {
				temp = input.charAt(i);
				if(temp >= 'A' && temp <= 'Z') {
					temp += 32;
					newSentence += temp;
				} else {
					newSentence += temp;
				}
			}
			return newSentence;
		}

		public String toUpperCase() {
			for(int i = 0; i < input.length(); i++) {
				temp = input.charAt(i);
				if(temp >= 'a' && temp <= 'z') {
					temp -= 32;
					newSentence += temp;
				} else {
					newSentence += temp;
				}
			}
			return newSentence;
		}

		public String toTitleCase() {

	for(int i = 0; i < input.length(); i++) {
				temp = input.charAt(i);
				if(i == 0) {
					if(temp >= 'a' && temp <= 'z') {
						temp -= 32;
					} 
				} else if(temp == ' ') {
					i++;
					temp = input.charAt(i);
					if(i< input.length()) {
						if(temp >= 'a' && temp <= 'z') {
							temp -= 32;
						} 
					}
					newSentence += " ";
				} else if(temp >= 'A' && temp <= 'Z') {
					temp += 32;
				} 
				newSentence += temp;
			}			
		return newSentence;
	}


		public String toggleCase() {
		for(int i = 0; i < input.length(); i++) {
				temp = input.charAt(i);
				if(temp >= 'a' && temp <= 'z') {
					temp -= 32;
					newSentence += temp;
				} else if(temp >= 'A' && temp <= 'Z') {
					temp += 32;
					newSentence += temp;
				}
			}
			return newSentence;
			
		}

		public String toSentenseCase() {
		 return "";
		}




}