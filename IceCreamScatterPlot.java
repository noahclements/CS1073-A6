import java.util.Scanner;
public class IceCreamScatterPlot {
	public static void main(String[] args) {
		int temp = 0;
		int price = 0;
		int counter = 0;
		int[][]valuesArray;

		//Scanner sc = new Scanner(System.in);
		//String file = sc.nextLine();
		//String temp1 = sc.nextLine();
		Scanner tokenizer = new Scanner(System.in);
		
		
		tokenizer.useDelimiter(",|\\s");
		String title = tokenizer.nextLine();
		//int temp1 = tokenizer.nextInt();
		//tokenizer.next();
		while(tokenizer.hasNextInt()) {

			temp = tokenizer.nextInt();
			price = tokenizer.nextInt();
			tokenizer.next();
			
			System.out.println(temp);
			System.out.println(price);
			counter++;
		}
		System.out.println("TITLE IS" + title);
		//System.out.println("temp: " + temp1);
		System.out.println("array should be " + counter);


	}


}