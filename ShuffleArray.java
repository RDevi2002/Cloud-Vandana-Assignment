import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();
        
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        
        shuffle(array);
        System.out.println("Shuffled array: " + Arrays.toString(array));
    }
    
}
