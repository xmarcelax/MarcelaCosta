
package homeworkq3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomeworkQ3 
{
   
    public static void main(String[] args) 
    {
        /*
            Create a program that will ask the user to enter the marks they have received for an assignment that
            is worth 20% of the marks for the module.
            The maximum mark is 100 and the minimum is 0 (zero). Output an error message if they enter any
            other number OR if they do not enter a number at all.
            If they enter a valid number, output the PERCENTAGE equivalent.
            The maximum result should be 20%. It should be possible to output a decimal value (e.g. 11.5%).
            MATHS REMINDER: if the user enters num, then the answer will be (num / 100) * 20
            EXAMPLE OUTPUT:
            >> Please enter your mark
            <<user enters 70>>
            >> You scored 14% out of a maximum of 20% 
      */
        
       // Declaration of variables
        // Keyboard reader creation
        
        double mark;
        double score;
        String temp;
        BufferedReader assignment = new BufferedReader (new InputStreamReader(System.in));
        
        // Ask the question
        System.out.println("Please enter your mark");
        
        try  // First try catch
        {
            temp =   assignment.readLine(); // Read the keyboard and save it in a variable that I called Temp in this case, being String then it stores Text
            try // Try cat again
            {
                mark = Double.parseDouble ( temp ); // Convert Temp to Double and store it in a Mark variable
                if (mark >=0 && mark <=100) // If the mark is between 0 - 100
                {
                    score = (mark/100)*20;  // Do the match
                    System.out.println("Your score is " + score + "%  out of maximum of 20%");  // Show the result
                }    
                else // if no
                {
                    System.out.println("ERROR - The number must be between 0 - 100"); // The number must be between 0 - 100
                }
            } 
            catch(Exception e)          
            {
                System.out.println(" ERROR - You did not enter a number "); // Error, you did not enter a number
            }
            
        } catch (IOException ex)
        {
            Logger.getLogger(HomeworkQ3.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
        
        
        
    }
    
}
