import java.util.Scanner;
public class ChangeCaseDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string.");

		String input = sc.nextLine();
		String input2 = input;
		String input3 = input;
		ChangeCase p1 = new ChangeCase(input);
		ChangeCase p2 = new ChangeCase(input2);
		ChangeCase p3 = new ChangeCase(input3);
		System.out.println(p1.toLowerCase());
		System.out.println(p2.toUpperCase());
		System.out.println(p3.toggleCase());

		



	}



}