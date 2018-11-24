public class ChangeCase {
	private String input
	private String temp;

	public ChangeCase(String inputIn) {
		input = inputIn;
	}

		public String toLowerCase() {
			return input.toLowerCase();
		}

		public String toUpperCase() {
			return input.toUpperCase();
		}

		public String toggleCase() {
			for(int i = 0; i < input.length; i++) {
				if(input.charAt(i).isUpperCase()) {
					input.charAt(i) = input.charAt(i).toLowerCase();
				} else if(input.charAt(i).isLowerCase()) {
					input.charAt(i) = input.charAt(i).toUpperCase();
				}
			}
			return input;
		}

		public String toTitleCase() {

		}

		public String toSentenseCase() {
			return input.toUpperCase(input.charAt(0));
		}



}