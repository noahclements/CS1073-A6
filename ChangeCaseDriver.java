import java.util.Scanner;
public class ChangeCaseDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string.");

		String input;
		//String input2 = input;
		//String input3 = input;
		//ChangeCase p1 = new ChangeCase(input);
		//ChangeCase p2 = new ChangeCase(input2);
		//ChangeCase p3 = new ChangeCase(input3);
		//System.out.println(p1.toSentenceCase());
	//	System.out.println(p2.toUpperCase());
	//	System.out.println(p3.toTitleCase());
		System.out.println("Enter a string ('-1' to quit)");
		do {
			input = sc.nextLine();
			
			ChangeCase p1 = new ChangeCase(input);
			System.out.println(p1.toUpperCase());

			ChangeCase p2 = new ChangeCase(input);
			System.out.println(p2.toLowerCase());

			ChangeCase p3 = new ChangeCase(input);
			System.out.println(p3.toggleCase());

			ChangeCase p4 = new ChangeCase(input);
			System.out.println(p4.toTitleCase());

			ChangeCase p5 = new ChangeCase(input);
			System.out.println(p5.toSentenceCase());

			System.out.println("Enter a string ('-1' to quit)");

		} while(!input.equals("-1"));
		



	}



}