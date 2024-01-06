//@author aliyanasu

//TESTTESTTESTTEST

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] occurrences = new int[51]; // Array to store occurrences (indices 1 to 50)

        System.out.print("Enter integers between 1 and 50 (enter 0 to end): ");

        int number;
        do {
            number = scanner.nextInt();

            if (number >= 1 && number <= 50) {
                occurrences[number]++;
            }

        } while (number != 0);

        // Print occurrences
        for (int i = 1; i <= 50; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + " occurs " + occurrences[i] + " time" + (occurrences[i] > 1 ? "s" : ""));
            }
        }
    }
}

