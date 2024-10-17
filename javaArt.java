/**
 * This program displays a Java logo in the console with specified formatting.
 * @param ANSI_BOLD The ANSI escape code for bold text.
 * @param ANSI_RESET The ANSI escape code to reset text formatting.
 */

public class JavaArt {

    public static void main(String[] args)
    {
        
	// ANSI escape code for bold text
        String ANSI_BOLD = "\u001B[1m";

	// ANSI escape code to reset text formatting
        String ANSI_RESET = "\u001B[0m";

          String art = """
            
            J    A   V     V    A  
            J   A A   V   V    A A 
        J   J  AAAAA   V V    AAAAA
         J J  A     A   V    A     A 
        
        """.formatted(ANSI_BOLD, ANSI_RESET);

        System.out.println(art);
    }
}


