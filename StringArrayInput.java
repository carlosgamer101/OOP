import java.util.Scanner;

// Custom exception class
class ArrayIndexExceededException extends Exception {
    public ArrayIndexExceededException(String message) {
        super(message); 
    }
}

public class StringArrayInput {

    // Method to populate array with user input
    public static void populateArray(String[] arr) throws ArrayIndexExceededException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 strings:");

        for (int i = 0; i < 11; i++) { // Allow up to 11 inputs
            System.out.print("String " + (i + 1) + ": ");
            String input = scanner.nextLine(); // Read input first

            if (i >= arr.length) {
                // Let the user enter the 11th string, then raise error
                throw new ArrayIndexExceededException("Error: You cannot enter more than 10 strings. The 11th string '" + input + "' was not stored.");
            }

            arr[i] = input;
        }
    }

    public static void main(String[] args) {
        String[] words = new String[10];

        try {
            populateArray(words);
        } catch (ArrayIndexExceededException e) {
            System.out.println("\n" + e.getMessage());
        }

        System.out.println("\nStored Strings:");
        for (String word : words) {
            if (word != null) {
                System.out.println(word);
            }
        }
    }
}
