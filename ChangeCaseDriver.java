import java.util.Scanner;
public class ChangeCaseDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
		input = sc.nextLine();
		if(input.equals("-1")) {

			} else {
				do {
					ChangeCase p1 = new ChangeCase(input);
					System.out.println("toUpper: " + p1.toUpperCase());

					ChangeCase p2 = new ChangeCase(input);
					System.out.println("toLower: " + p2.toLowerCase());

					ChangeCase p3 = new ChangeCase(input);
					System.out.println("toggleCase: " + p3.toggleCase());

					ChangeCase p4 = new ChangeCase(input);
					System.out.println("toTitleCase: " + p4.toTitleCase());

					ChangeCase p5 = new ChangeCase(input);
					System.out.println("toSentenceCase: " + p5.toSentenceCase());

					System.out.println("\n" + "Enter a string ('-1' to quit)");
					input = sc.nextLine();
				} while(!input.equals("-1"));
			}
	}
}