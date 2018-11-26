import java.util.Scanner;
public class IceCreamScatterPlot {
	public static void main(String[] args) {
		int temp = 0;
		int price = 0;
		int counter = 0;
		//int[][] valuesArray;
		int[] valuesArray = new int[30];

		Scanner tokenizer = new Scanner(System.in);
		
		
		tokenizer.useDelimiter(",|\\s");
		String title = tokenizer.nextLine();
		//String numsRepeat = "";
		//String priceRepeat = "";
		//String tempRepeat = "";

		while(tokenizer.hasNextInt()) {
			temp = tokenizer.nextInt();
			valuesArray[temp] = tokenizer.nextInt();
			tokenizer.next();

		}

		// PRINTING 2D Array
			String graph = "";
			int columnNumPrint = 0;
			int dollarPrint = 10;
			int cashPrice = 0;
			System.out.println(title);
			for(int row = 0; row < 12; row++) {
				if(dollarPrint == 0) {
					cashPrice = 0;
					System.out.print("$"+(cashPrice) + "\t" + "L");	// change that later
				} else if(row == 11){
					System.out.print("\t");
				}else {
					cashPrice = dollarPrint * 100;
					System.out.print("$"+(cashPrice) + "\t" + "|");
				}
				//dollarPrint--;
					for(int column = 0; column < valuesArray.length; column++) {
						if(valuesArray[column] == cashPrice && valuesArray[column] != 0) {
							System.out.print("*");
						} else if(dollarPrint == 0) {
							System.out.print("-");
						} else if(dollarPrint == -1 && columnNumPrint < 31) {
							System.out.print(columnNumPrint + "    ");
							columnNumPrint += 5;
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
					dollarPrint--;
				}
					
			
		


		// this is actually kinda a useful algorithm (finds the array length when not given, and also makes two strings with the values given)
		// but its completely useless for this assignment, maybe useful in the future..
		// 	maybe the adderall was worth it
		/*
		while(tokenizer.hasNextInt()) {
			
			temp = tokenizer.nextInt();
			price = tokenizer.nextInt();

			tempRepeat += temp + "\n";
			priceRepeat += price + "\n";


			tokenizer.next();
			

			System.out.println(temp);
			System.out.println(price);
			counter++;
		}

		valuesArray = new int[counter][counter];

		Scanner tempScan = new Scanner(tempRepeat);
		Scanner priceScan = new Scanner(priceRepeat);
		tempScan.useDelimiter("\n");
		priceScan.useDelimiter("\n");
		
			
			// adding to 2d array
			for(int x = 0; x < valuesArray[0].length; x++) {
				valuesArray[0][x] = tempScan.nextInt();
				valuesArray[1][x] = priceScan.nextInt(); 
			}
		
			

			// PRINTING 2D Array
			String graph = "";
			int columnNumPrint = 0;
			int dollarPrint = 10;
			System.out.println(title);
			for(int row = 0; row < 11; row++) {
				//graph += ("$"+(dollarPrint*100) + "\t" + "|");
				//dollarPrint--;
				if(dollarPrint == 0) {
					System.out.print("$"+(0*100) + "\t" + "L");	// change that later
				} else {
					System.out.print("$"+(dollarPrint*100) + "\t" + "|");
				}

					for(int column = 0; column < 31; column++) {

						if(dollarPrint < 0) {
							System.out.print(columnNumPrint + "     ");
							columnNumPrint += 5;
							System.out.print("-");
						} if(dollarPrint == 0) {
							System.out.print("-");
						} else 
							System.out.print("x"); // fix
						}
					}
					System.out.println();
					dollarPrint--;
			}

*/


/*
			for(int i = 0; i < valuesArray.length; i++){
				for(int j = 0; j < valuesArray[0].length; j++){
					System.out.print(valuesArray[i][j] + " ");
				}
				System.out.println();
			}
		
*/
	


	}


}