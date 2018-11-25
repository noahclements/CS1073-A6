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
/*
		for(int i = 1; i < gradeArray.length + 1; i++) {
				while(!valid) {
					System.out.println("Enter grade " + i);
					temp = sc.nextDouble();
					if(temp > 0 || temp < 100.0) {	// if the input matches the requirements, ie. is between 0 - 100.0
						gradeArray[i - 1] = temp;
						valid = true;
					}
				}
			}


*/
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



			/*
			// version 3
			for(int i = 1; i < gradeArray.length + 1; i++) {
				System.out.println("Enter grade " + i);
				temp = sc.nextDouble();
				if(temp < 0 || temp > 100.0) {	// if its out of range
					while(true) {
						System.out.println("Enter grade " + i);
						temp = sc.nextDouble();
						if(temp > 0 || temp < 100.0) {
							gradeArray[i - 1] = temp;
							break;
						}
					}
				} else {
					gradeArray[i - 1] = temp;
				}
			}
*/
			//final double gradeHighSwap = gradeArray[0];
		//	final double gradeLowSwap = gradeArray[gradeArray.length - 1];
/*
			for(int i = 0; i < gradeArray.length; i++) {
				for(int x = gradeArray.length - 1; x > 0; x--) {
					
					if(gradeArray[x] > gradeArray[0]) {	// this is for puting the highest grade at the top of the array
						gradeHigh = gradeArray[x];
						gradeHighSwap = gradeArray[0];
						//gradeArray[i] = gradeArray[x];
						//gradeArray[0] = gradeHigh;	// done to flip both of the numbers
					}

					if(gradeArray[0] > gradeArray[x]) {	// this is for putting the LOWEST grade at the bottom of the array
						gradeLow = gradeArray[i];
						gradeArray[i] = gradeArray[x];
						gradeArray[gradeArray.length - 1] = gradeLow;	// done to flip both of the numbers
		
					
				}
			}
		}
*/
		double gradeHighSwap = 0;
		double gradeLowSwap = 0;
		
		// version 2
		for(int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i] > gradeHigh) {
				gradeHigh = gradeArray[i];
				gradeHighSwap = gradeArray[0];
			}
		}
		
		for(int j = 0; j < gradeArray.length; j++) {
			if(gradeArray[j] == gradeHigh) {
				gradeArray[0] = gradeHigh;
				gradeArray[j] = gradeHighSwap;
			}
		}


		double gradeLow = 100.0;

		for(int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i] < gradeLow) {	
				gradeLow = gradeArray[i];
				gradeLowSwap = gradeArray[gradeArray.length - 1];
			}
		}

		for(int j = 0; j < gradeArray.length; j++) {
			if(gradeArray[j] == gradeLow) {
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


