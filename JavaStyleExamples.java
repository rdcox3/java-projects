import java.util.Date;

/* HelloJava
 * 
 * Provides an example of Java Style
 * Class header comment is above the class declaration using C-style notation
 */
public class JavaStyleExamples
{
   // main() should be at the top of a class after any constructor(s).
   // Method header comments use // notation
   public static void main(String[] args)
   {
      JavaStyleExamples helloJava = new JavaStyleExamples();
      helloJava.run();
   } // end main
   
   // run()
   //
   // A non-static member function which can access instance data
   public void run()
   {
      // Let the user know if today is a Tuesday
      if (isATuesday())
      {
         System.out.println("Today is a Tuesday");
      }
      
      // Final constant names will be all capital letters 
      // One space before and after operators 
      // Using DOZEN instead of 12 avoids a magic number
      final int DOZEN = 12;
   } // end run
   
   // isATuesday()
   //
   // Returns true if today is a Tuesday
   //    methods are camelCase
   private boolean isATuesday()
   {
      // Methods should only have one return statement 
      // (or no return in case of void method) when practical
      return this.dateStr.contains("Tue");
   }
   
   private long millis = System.currentTimeMillis();
   private Date date = new Date(millis);   
   private String dateStr = date.toString();

} // end HelloJava

/* Car
 * 
 * Provides example of static and non-static methds
 */
class Car
{
   // convertMpgToKpl(double mpg) 
   //
   // Converts Miles per Gallon to Kilometers per Liter
   // Is static because one might want to know what 35mpg converts to
   // even if nobody has ever built a Car 
   public static double convertMpgToKpl(double mpg)
   {
      return 0.425144 * mpg;
   }
   
   // setMileage(double mpg) 
   //
   // Sets the efficiency of one particular Car
   // Can't be static since it's inconceivable to call the method 
   // before any Car has been constructed
   public void setMileage(double mpg)
   {
      this.mpg = mpg;
   }
   
   private double mpg; // Efficiency of the Car
   
}
