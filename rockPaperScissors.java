/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author jacob
 */
public class rockPaperScissors {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    private int input = 0; private int randomNumber = 0;
    String tie = "It's a tie!";
    String win = "It's a win!";
    String lose = "You lose";
    String a = "Computer Had: ";
    public void welcomeScreen(){
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Type: (1)-Rock (2)-Paper (3)-Scissors");
    }
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        input = sc.nextInt();
        while(input <=0 || input >=4){
            System.out.print("Enter a choice in the correct format: ");
            input = sc.nextInt();
        }
    }
    
    public void rpsGame(){
        Random rnd = new Random();
        randomNumber = rnd.nextInt(3-1+1)-1;
        
        if(randomNumber == ROCK){
            if(input == ROCK){
                System.out.println(tie);
            }
            if(input == PAPER){
                System.out.println(win);
            }
            if(input == SCISSORS){
                System.out.println(lose);
            }
        }
        
        if(randomNumber == PAPER){
            if(input == ROCK){
                System.out.println(lose);
            }
            if(input == PAPER){
                System.out.println(tie);
            }
            if(input == SCISSORS){
                System.out.println(win);
            }
        }
        
        if(randomNumber == SCISSORS){
            if(input == ROCK){
                System.out.println(win);
            }
            if (input == PAPER){
                System.out.println(lose);
            }
            if (input == SCISSORS){
                System.out.println(tie);
            }
        }
    }
}
