public class uc5 {
    public static void main(String[] args) {

        // Define and populate the array at declaration
        String[] lines = {
            String.join("   ", "   ***  ", "   ***  ", "  *****  ", "  *****  "),
            String.join("   ", " **   **", " **   **", "  **   **", " **    "),
            String.join("   ", "**     **", "**     **", "**    **", "**     "),
            String.join("   ", "**     **", "**     **", "*****   ", " ***** "),
            String.join("   ", "**     **", "**     **", "**      ", "      **"),
            String.join("   ", " **   ** ", " **   ** ", "**      ", " **   **"),
            String.join("   ", "  ***    ", "  ***    ", "**      ", "  ***  ")
        };

        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
