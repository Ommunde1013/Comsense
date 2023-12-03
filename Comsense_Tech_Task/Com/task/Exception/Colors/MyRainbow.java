/*
 * 1. Define a class which contains the method DisplayColor which 
 * takes one character as argument. Raise an error if the character 
 * is not an alphabet. If the alphabet is a color of the rainbow, 
 * display the color name. If it is any other alphabet, report an error.
 * 
 * Note: Use assertions.
 */

package Com.task.Exception.Colors;

import java.util.Scanner;

public class MyRainbow 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        String alpha = sc.next();

        try 
        {
            displayColor(alpha);
        } 
        
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        } 
        
        finally 
        {
            sc.close();
        }
    }

    private static void displayColor(String alpha) 
    {
        // Check if input is a single alphabet
        if (alpha.length() != 1 || !Character.isLetter(alpha.charAt(0))) 
        {
            throw new IllegalArgumentException("Invalid input: Please enter a single alphabet.");
        }

        char letter = Character.toLowerCase(alpha.charAt(0));

        // Checking if the alphabet is a color of the rainbow
        
        /*
         *  Assertions in Java are a way to verify assumptions during the development 
         *  and testing phase. They help identify bugs and incorrect assumptions by 
         *  throwing an error if a given condition is not true.
         */
        
        switch (letter) 
        {
            case 'r':
                System.out.println("Red");
                break;
            case 'o':
                System.out.println("Orange");
                break;
            case 'y':
                System.out.println("Yellow");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'i':
                System.out.println("Indigo");
                break;
            case 'v':
                System.out.println("Violet");
                break;
            default:
                throw new IllegalArgumentException("The entered alphabet does not represent a color of the rainbow.");
        }
    }
}
