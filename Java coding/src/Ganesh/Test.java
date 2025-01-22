package Ganesh;
public class Test {
    public static void main(String[] args) {
        String input = "Ganesh kumar";
        int[] charCount = new int[256];  // Array to store count of each character (assuming ASCII)
        // Count occurrences of each character
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCount[currentChar]++;  // Increment count for each character
        }
        System.out.println("Repeated characters in the given string:");
        // Display characters with a count greater than 1
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " - " + charCount[i] + " times");
            }
        }
    }
}