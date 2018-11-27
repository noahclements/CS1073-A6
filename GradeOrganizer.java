import java.util.Scanner;
public class GradeOrganizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		double gradeHigh = 0;
		boolean valid = false;
		int counter = 1;

		System.out.println("How many grades will you enter?");
		int numOfGrades = sc.nextInt();

		double[] gradeArray = new double[numOfGrades];


				// version 2
			for(int i = 0; i < gradeArray.length; i++, counter++) {
				System.out.println("Enter grade " + counter);
				temp = sc.nextDouble();
				while(temp < 0 || temp > 100.0) {
					System.out.println("Enter grade " + counter);
					temp = sc.nextDouble();
				}
				gradeArray[i] = temp;
			}

		double gradeHighSwap = 0;
		double gradeLowSwap = 0;
		double gradeLow = 100.0;

		// version 2

		//find the biggest grade
		for(int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i] > gradeHigh) {
				gradeHigh = gradeArray[i];
				gradeHighSwap = gradeArray[0];
			}
		}
		// looks for that grade in the array again
		for(int j = 0; j < gradeArray.length; j++) {
			if(gradeArray[j] == gradeHigh) {	// swaps places
				gradeArray[0] = gradeHigh;
				gradeArray[j] = gradeHighSwap;
			}
		}


		// find the lowest grade
		for(int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i] < gradeLow) {	
				gradeLow = gradeArray[i];
				gradeLowSwap = gradeArray[gradeArray.length - 1];
			}
		}
		// looks for that grade in the array again
		for(int j = 0; j < gradeArray.length; j++) {
			if(gradeArray[j] == gradeLow) {	// swaps places
				gradeArray[j] = gradeLowSwap;
				gradeArray[gradeArray.length - 1] = gradeLow;
			}
		}




			System.out.println("Reordered grades");
			for(int j = 0; j < gradeArray.length; j++){
				System.out.println(gradeArray[j]);
			}


		}
		




	}


