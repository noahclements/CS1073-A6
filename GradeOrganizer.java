/**
	A class representing the grade organizer
	@author Noah Clements 3585596
*/
import java.util.Scanner;
public class GradeOrganizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		int counter = 1;
		double gradeHigh = 0;
		double gradeLow = 100.0;
		int highIndex = 0;
		int lowIndex = 0;

		System.out.println("How many grades will you enter?");
		int numOfGrades = sc.nextInt();

		double[] gradeArray = new double[numOfGrades];


				// asks until it hits the numOfGrades max
			for(int i = 0; i < gradeArray.length; i++, counter++) {
				System.out.println("Enter grade " + counter);
				temp = sc.nextDouble();
				while(temp < 0 || temp > 100.0) {	// keeps asking until its valid input
					System.out.println("Enter grade " + counter);
					temp = sc.nextDouble();
				}
				gradeArray[i] = temp;
			}



		// find highest grade
		for(int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i] > gradeHigh) {
				gradeHigh = gradeArray[i];
				highIndex = i;
			}
		}
		// swaps values
		gradeArray[highIndex] = gradeArray[0];
		gradeArray[0] = gradeHigh;

		

		// find the lowest grade
		for(int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i] < gradeLow) {	
				gradeLow = gradeArray[i];
				lowIndex = i;
			} 
		}
		// swaps values
		gradeArray[lowIndex] = gradeArray[gradeArray.length - 1];
		gradeArray[gradeArray.length - 1] = gradeLow; 


			// prints out values
			System.out.println("Reordered grades");
			for(int j = 0; j < gradeArray.length; j++){
				System.out.println(gradeArray[j]);
			}

		}

	}
