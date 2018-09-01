package week1_lab1_mathquizzer;

import java.util.*;

/**
 *
 * @author briannavides
 * @date Assignment: BriannaVidesWeek1Lab1:
 *
 * Algorithm: Part 1 Create variables ask for operation Generate 2 random
 * numbers if subtraction check first num is bigger than second Plug in numbers
 * to calc Calculate Ask for answer Compare answers Respond Loop 10 times
 *
 * Algorithm: Part 2 Create variables Generate 2 random numbers Plug in numbers
 * to calc Calculate addition Ask for answer Compare answers Respond Loop 10
 * times
 */
public class Week1_Lab1_MathQuizzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //part 2
        int firstNumber, secondNumber, calcAnswer, studentAnswer, counter; //creating variables for the two random numbers, the correct answer, the student answer, and the counter
        int correct=0, incorrect=0;
        String operation;
        Random anyNum = new Random();
        Scanner keyboard = new Scanner(System.in);
        counter = 0;//set counter
        
        System.out.println("Would you like to do addition or subtraction?");
        operation = keyboard.nextLine();
        if (operation.equals("addition")) {
            while (counter < 10) //makes sure it is only asked 10 times
            {
                firstNumber = anyNum.nextInt(10);//generating Random numbers between 0 and 9
                secondNumber = anyNum.nextInt(10);//generating Random numbers between 0 and 9
                calcAnswer = firstNumber + secondNumber;//calculating correct answer
                System.out.println(firstNumber + " + " + secondNumber + " = ");//displaying equation
                studentAnswer = keyboard.nextInt();//accept answer into variable
                if (studentAnswer == calcAnswer)//compare answers
                {
                    System.out.println("Congratulations you are corect!");
                    correct++;
                } else {
                    System.out.println("Unfortunately you are incorrect");
                    incorrect++;
                }

                counter = counter + 1;//so there are only 10 questions
            }

            System.out.println("\nTest is completed have a nice day! You got "+ correct +" correct and "+incorrect+" incorrect.");

        } else {
            while (counter < 10) //makes sure it is only asked 10 times
            {
                firstNumber = anyNum.nextInt(10);//generating Random numbers between 0 and 9
                secondNumber = anyNum.nextInt(10);//generating Random numbers between 0 and 9
                if (firstNumber > secondNumber) { //checks first num bigger than second
                    calcAnswer = firstNumber - secondNumber;//calculating correct answer
                    System.out.println(firstNumber + " - " + secondNumber + " = ");//displaying equation
                    studentAnswer = keyboard.nextInt();//accept answer into variable
                    if (studentAnswer == calcAnswer)//compare answers
                    {
                        System.out.println("Congratulations you are corect!");
                        correct++;
                    } else {
                        System.out.println("Unfortunately you are incorrect");
                        incorrect++;
                    }

                    counter = counter + 1;//so there are only 10 questions
                }

            }

            System.out.println("\nTest is completed have a nice day!  You got "+ correct +" correct and "+incorrect+" incorrect.");

        }

    }
}

