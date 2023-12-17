/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;
import java.util.Scanner;
/**
 *
 * @author jacob
 */
public class RockPaperScissorsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rockPaperScissors rps = new rockPaperScissors();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        
        rps.welcomeScreen();
        while(choice == 1){
            rps.getInput();
            rps.rpsGame();
            System.out.println("Do you want to play again?");
            System.out.print("Enter 1 for yes, any other key to exit: ");
            choice = sc.nextInt();
        }
        
    }
    
}
