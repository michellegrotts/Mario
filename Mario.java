/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author Michelle
 */
public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter the number of rows: ");
        int rows = keyboard.nextInt();
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows-i; j++)
            {
                out.print(" ");                
            }
            for (int j = rows-i; j <= rows+1; j++)
            {
                out.print("#");                
            }
            out.print("\n");
        }
        }
    }
    

