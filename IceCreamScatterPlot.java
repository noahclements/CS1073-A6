import java.util.Scanner;
public class IceCreamScatterPlot {
	public static void main(String[] args) {
		int temp = 0;
		int price = 0;
		int counter = 0;
		int[][] valuesArray;

		Scanner tokenizer = new Scanner(System.in);
		
		
		tokenizer.useDelimiter(",|\\s");
		String title = tokenizer.nextLine();
		//String numsRepeat = "";
		String priceRepeat = "";
		String tempRepeat = "";
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
		valuesArray = new int[2][counter];

		Scanner tempScan = new Scanner(tempRepeat);
		Scanner priceScan = new Scanner(priceRepeat);
		tempScan.useDelimiter("\n");
		priceScan.useDelimiter("\n");
		
			
		
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
						} else {
							System.out.print("x");
						}
					}
					System.out.println();
					dollarPrint--;
			}





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