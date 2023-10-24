import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String roman) {
        // Create a map to store the numeric values of Roman numerals
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentNumeralValue = romanNumerals.get(roman.charAt(i));

            // Check if the next numeral is larger and needs to be subtracted
            if (i < roman.length() - 1 && currentNumeralValue < romanNumerals.get(roman.charAt(i + 1))) {
                result -= currentNumeralValue;
            } else {
                result += currentNumeralValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.next();

        int result = romanToInt(romanNumeral);
        System.out.println("The integer representation of " + romanNumeral + " is: " + result);
    }
}
    

