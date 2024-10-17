
/**
 * This program is an example of code formatting and is not designed to 
 * produce any meaningful results.
 *
 * @author: John Deal
*/

import java.util.Scanner;

public class CodeExample
{
   /**
    * Returns joke based on jokeNumber.
    *
    **/
   public String getMusicJoke(int jokeNumber)
   {
      final String NO_JOKE = "No Joke";
      final String SINGER_JOKE = "How do you tell if there is a singer "
            + "at the door?  They never have the right key and don't know " + "when to come in!";
      final String GUITARIST_JOKE = "How do you get a guitarist to be " + "quiet?  Put sheet music in front of them!";

      String joke;

      // Determine joke
      switch (jokeNumber)
      {
      case SINGER_JOKE_NUMBER:
         joke = SINGER_JOKE;
         break;

      case GUITARIST_JOKE_NUMBER:
         joke = GUITARIST_JOKE;
         break;

      default:
         joke = NO_JOKE;
         break; // Not necessary but good practice.
      } // End switch (jokeNumber).

      return joke;
   } // end getMusicJoke

   /**
    * Program entry point.
    **/
   public static void main(String[] args)
   {
      final int MIN_COUNTER = 0;
      final int MAX_COUNTER = 10;

      String className = "CodeExample";
      int counter;
      float value;

      className = "CodeExample";
      CodeExample codeExample = new CodeExample();

      // Print class name with incrementing counter appended.
      for (counter = MIN_COUNTER; counter < MAX_COUNTER; counter++)
      {
         System.out.println("Name: " + className + "_" + counter);
      }

      System.out.println("-----------------"); // Output divide.

      // Print class name with decrementing counter appended.
      while (counter > MIN_COUNTER)
      {
         System.out.println("Name: " + className + "_" + counter);
         --counter;
      }

      // Display result
      if (counter < MIN_COUNTER)
      {
         System.out.println("Dropped below minimum counter.");
      } else
      {
         System.out.println("Did not drop below minimum counter.");
      }

      // Display counter state
      switch (counter)
      {
      case MIN_COUNTER:
         System.out.println("At MIN_COUNTER.");
         break;

      case MAX_COUNTER:
         System.out.println("At MAX_COUNTER.");
         break;

      default:
         System.out.println("Counter is: " + counter);
         break;
      } // End switch (counter).

      System.out.println("Now for a couple of jokes...");
      System.out.println(codeExample.getMusicJoke(SINGER_JOKE_NUMBER));
      System.out.println(codeExample.getMusicJoke(GUITARIST_JOKE_NUMBER));
   } // end main()

   // Joke numbers.
   private final static int SINGER_JOKE_NUMBER = 1;
   private final static int GUITARIST_JOKE_NUMBER = 2;
} // end CodeExample