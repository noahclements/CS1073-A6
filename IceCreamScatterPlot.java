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

			//numsRepeat += (temp + "," + price + "\n");

			tokenizer.next();
			

			System.out.println(temp);
			System.out.println(price);
			counter++;
		}
		valuesArray = new int[2][counter];

		//tokenizer = new Scanner(numsRepeat);
		Scanner tempScan = new Scanner(tempRepeat);
		Scanner priceScan = new Scanner(priceRepeat);
		tempScan.useDelimiter("\n");
		priceScan.useDelimiter("\n");
		
			
		
			for(int x = 0; x < valuesArray[0].length; x++) {
				valuesArray[0][x] = tempScan.nextInt();
				valuesArray[1][x] = priceScan.nextInt(); 
			}
		
			

			// PRINTING 2D Array
			for(int i = 0; i < valuesArray.length; i++){
				for(int j = 0; j < valuesArray[0].length; j++){
					System.out.print(valuesArray[i][j] + " ");
				}
				System.out.println();
			}
		

		System.out.println("TITLE IS" + title);
		System.out.println("array length is : " + valuesArray[0].length);
		System.out.println("array should be " + counter);
		//System.out.println(valuesArray[1][7]);



	}


}