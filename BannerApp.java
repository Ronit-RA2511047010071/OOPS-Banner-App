public class OOPSBannerApp {

    // ─── Static Inner Class ────────────────────────────────────────────────────
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor: binds a character to its ASCII art pattern
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter: returns the character this map represents
        public char getCharacter() {
            return character;
        }

        // Getter: returns the banner pattern (array of rows) for this character
        public String[] getPattern() {
            return pattern;
        }
    }
    // ──────────────────────────────────────────────────────────────────────────

    public static void main(String[] args) {

        // Define each character and its ASCII art pattern
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
            "   ***  ",
            " **   **",
            "**     **",
            "**     **",
            "**     **",
            " **   **",
            "   ***  "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
            " *****  ",
            " **   **",
            "**    **",
            "**  ***   ",
            "**      ",
            " **      ",
            " **      "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
            "  ***********  ",
            " **    ",
            "**     ",
            " ***** ",
            "      **",
            " **   **",
            "  ***  "
        });

        // Build the OOPS word using an array of CharacterPatternMap objects
        CharacterPatternMap[] oops = { charO, charO, charP, charS };

        // Use StringBuilder to construct each row across all characters
        int rows = charO.getPattern().length;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < oops.length; col++) {
                line.append(oops[col].getPattern()[row]);

                // Add spacing between letters (not after the last one)
                if (col < oops.length - 1) {
                    line.append("   ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
