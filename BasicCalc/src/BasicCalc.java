import java.util.*;

public class BasicCalc {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws ArithmeticException {
		
			String operation;
			int choice=getUserChoice();		

			switch (choice) {

			case 1:
				operation = "Added";

				String inputAdd = getUserInput(operation);
				ArrayList<Double> numbers = convertCsvToDoubleList(inputAdd);

				Double totalAdd = (double) 0;
				for (Double number : numbers) {
					totalAdd = totalAdd + number;
				}
				System.out.println("Total = " + totalAdd);
				break;

			case 2:
				operation = "Subtraction";
				String inputSub = getUserInput(operation);
				ArrayList<Double> numbers1 = convertCsvToDoubleList(inputSub);

				Double totalSub = (double) 0;
				boolean firstNumber = true;
				for (Double number : numbers1) {
					if (firstNumber) {
						totalSub = number;
						firstNumber = false;
					} else {
						totalSub = totalSub - number;
					}
				}
				System.out.println("Total = " + totalSub);
				break;

			case 3:
				operation = "Multiplication";

				String inputMul = getUserInput(operation);
				ArrayList<Double> numbers3 = convertCsvToDoubleList(inputMul);

				Double totalMul = (double) 0;
				boolean firstNum=true;
				for (Double number : numbers3) {
					if (firstNum) {
						totalMul = number;
						firstNum = false;
					} else {
						totalMul = totalMul * number;
					}
				}
				System.out.println("Total = " + totalMul);
				break;

			case 4:
				operation = "Divition";
				
				String inputDiv = getUserInput(operation);
				ArrayList<Double> numbers4 = convertCsvToDoubleList(inputDiv);
				int length=numbers4.size();
				Double totalDiv = (double) 0;
				boolean firstNu=true;
				if (length==2) {
					for (Double number : numbers4) {
						if (firstNu) {
							totalDiv = number;
							firstNu = false;
						} else {
							totalDiv = totalDiv/ number;
						}
					}
					System.out.println("Total = " + totalDiv);
				}else{
					System.out.println("please enter 2 numbers only to perform division ");
				}				
			}
		}
	private static int getUserChoice() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("99.Exit");
		System.out.println("Enter Your Choice: ");

		int input = scan.nextInt();

		if ((input >= 1 && input <= 4) || (input == 99)) {
			return input;
		} else {
			throw new IllegalArgumentException("'" + input + "' is an invalid choice!");
		}
	}

	private static String getUserInput(String operation) {
		if (operation == null || operation.isEmpty()) {
			throw new IllegalArgumentException("The operation descriptor cannot be null or empty!");
		}

		System.out.print("Please enter the numbers to be " + operation + ":");

		String input = scan.next();

		System.out.println();

		return input;

	}

	private static Double getNumber(String input) {
	
		Double doubleVal = Double.valueOf(input);

	//	System.out.println(doubleVal);
		return doubleVal;
	}

	private static ArrayList<Double> convertCsvToDoubleList(String csvInput) {

		csvInput = csvInput.trim();

		// If resulting input string is empty, then display default message - No numbers
		// found!
		ArrayList<Double> inputNumbers = new ArrayList<Double>();

		if (csvInput.isEmpty()) {
			System.out.println("No numbers found!");
			return inputNumbers;
		}

		// If resulting input string is NOT empty,
		// ........Split the input string by comma
		// ........For each split item
		// ..............Remove all leading and trailing white spaces
		// ..............Check if resulting item is a numeric value. If not, throw
		// exception
		// - Non-numeric values are not allowed!
		String[] splitItems = csvInput.split(",");

		for (String splitItem : splitItems) {
			splitItem = splitItem.trim();
			inputNumbers.add(getNumber(splitItem));
		}
		return inputNumbers;
	}
}