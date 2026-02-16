public class BannerApp {

    // Banner class (OOPS concept)
    static class Banner {
        private String text;
        private int width;
        private char symbol;

        // Constructor
        public Banner(String text, int width, char symbol) {
            this.text = text;
            this.width = width;
            this.symbol = symbol;
        }

        // Method to display banner
        public void display() {
            printBorder();
            printText();
            printBorder();
        }

        private void printBorder() {
            for (int i = 0; i < width; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        private void printText() {
            int padding = (width - text.length()) / 2;
            for (int i = 0; i < padding; i++) {
                System.out.print(" ");
            }
            System.out.println(text);
        }

        // Method to update text
        public void updateText(String newText) {
            this.text = newText;
        }
    }

    // Main method
    public static void main(String[] args) {

        Banner banner = new Banner("Welcome to OOPS App", 40, '*');
        banner.display();

        System.out.println("\nUpdating Banner...\n");

        banner.updateText("Java is Simple!");
        banner.display();
    }
}
