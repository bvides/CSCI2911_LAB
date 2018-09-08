/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briannavideslab2_rockpaperscissors;

/**
 *
 * @author briannavides
 * @date sept. 7, 2018
 * Assignment: BriannaVidesWeek1Lab1:
 *
 * Algorithm: 1. Present prompt and Rules 
 * 2. Ask for "weapon"
 * 3. Randomly generate for computer 
 * 4. Compare 
 * 5. Display winner/tied 6.next round
 *
 */
import java.util.*;

public class BriannaVidesLab2_RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);//allows user to input 
        Random rand = new Random();//will creat a random number for computer
        int userWeapon, compWeapon, anotherRnd;
         System.out.println("Welcome to Rock, Paper, Scissors! \n Here are the rules: \n Rock Beats Scissors \n Scissors Beats Paper \n Paper Beats Rock");
        do {
            System.out.println("Please pick a weapon \n 1 for Rock\n 2 for Scissors\n 3 for Paper");//instructions
            userWeapon = keyboard.nextInt();//saves user weapon in avariable
                if(userWeapon>3 || userWeapon<1){ //checks that the input is valid
                    System.out.println("No no no, nice try, but that answer is not valid");
                }else{//if valid execute game
                    compWeapon = rand.nextInt(3) + 1;//computer designated a random weapon
                        if (userWeapon == compWeapon) {//displays outcome: Tie or who won
                            System.out.println("It was a Tie!");
                            if(userWeapon==1){ //displays what they weapons played were
                                System.out.println("We both played rock.");
                            }
                            else if(userWeapon==2){
                                System.out.println("We both played scissors.");
                            }
                            else{
                                System.out.println("We both played paper.");
                            }
                        } else if (userWeapon == 1 && compWeapon == 2) {//compares outcomes to see if player one
                            System.out.println("Congratulations! You won! I played scissors you played rock.");
                        } else if (userWeapon == 2 && compWeapon == 3) {
                            System.out.println("Congratulations! You won! I played paper you played scissors.");
                        } else if (userWeapon == 3 && compWeapon == 1) {
                            System.out.println("Congratulations! You won! I played rock you played paper.");
                        } else {
                    System.out.println("Oh no! You lost!");
                        if(userWeapon==1){ //displays players weapon
                                System.out.println("You played rock.");
                            }
                            else if(userWeapon==2){
                                System.out.println("You played scissors.");
                            }
                            else{
                                System.out.println("You played paper.");
                            }
                        if(compWeapon==1){ //displays computers weapon
                                System.out.println("I played rock.");
                            }
                            else if(userWeapon==2){
                                System.out.println("I played scissors.");
                            }
                            else{
                                System.out.println("I played paper.");
                            }
                    }
                }        
            System.out.println("Would you like to play again?\nInsert 1 for yes 0 for no");//another round?
            anotherRnd = keyboard.nextInt();
        }while (anotherRnd == 1); //The game will repeat as long as the player enters 1(yes)
             System.out.println("Thank you for playing!");
       }
    }
   
