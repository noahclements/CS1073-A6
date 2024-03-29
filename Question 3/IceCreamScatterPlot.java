/**
	A class representing the Ice Cream Scatter Plot
	@author Noah Clements 3585596
*/
import java.util.Scanner;
public class IceCreamScatterPlot {
	public static void main(String[] args) {
		int temp = 0;
		int[] valuesArray = new int[31];

		Scanner tokenizer = new Scanner(System.in);
		
		
		tokenizer.useDelimiter(",|\\s"); // ignores comma's and spaces
		String title = tokenizer.nextLine(); // gets the title
		// goes through the input until it hits "end"
		while(tokenizer.hasNextInt()) {
			temp = tokenizer.nextInt();
			valuesArray[temp] = tokenizer.nextInt();
			tokenizer.next();
		}

		// PRINTING 2D Array
			int columnNumPrint = 0;
			int dollarPrint = 10;
			int cashPrice = 0;
			System.out.println(title);
			for(int row = 0; row < 12; row++) {
				if(dollarPrint == 0) {
					cashPrice = 0;
					System.out.print("$"+(cashPrice) + "\t" + "\u2514");	
				} else if(row == 11){
					System.out.print("\t ");
				} else {
					cashPrice = dollarPrint * 100;
					System.out.print("$"+(cashPrice) + "\t" + "|");
				}
					for(int column = 0; column < valuesArray.length; column++) {
						if(valuesArray[column] == cashPrice && valuesArray[column] != 0) {
							System.out.print("*");
						} else if(dollarPrint == 0) {
							System.out.print("-");
						} else if(dollarPrint == -1 && columnNumPrint < 31) {
							if(columnNumPrint >= 10) {
								System.out.print(columnNumPrint + "   ");
							} else {
								System.out.print(columnNumPrint + "    ");
							}
							columnNumPrint += 5;
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
					dollarPrint--;
				}

	}


}