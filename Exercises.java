
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alex Filip on 7/17/2017 3:15 PM.
 * All test methods work correspondingly to desired behaviour.
 * Outputs given are as expected.
 */


public class Exercises {



    public class ReadInput {
        public int readNumber(){
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
    }
    /**
     * ### EX 1 ###
     * Requirement Exercise 1: Convert a given F temperature in C temperature (C=5/9*(F-32)
     */
    public double convertFtoCtemperature(double F) {
        return 5.0 / 9 * (F - 32);
    }

    /**
     * ### EX 2 ###
     * Requirement Exercise 2: Given two numbers, see which one is the greatest and print it
     */
    public double greatestNumber(double firstNumber, double secondNumber) {

        if (firstNumber > secondNumber)
            return firstNumber;
        return secondNumber;
    }

    /**
     * ### EX 3 ###
     * Requirement Exercise 3: Given a text input, if it is “Evozon”,
     * then print “Learning text comparison”. If not, print “Got to try some more”
     */
    public String inputTxtEvoTheBest(String inputText) {

        if (inputText.equals("Evozon"))
            return "Learning text comparison";
        return "Got to try some more";
    }

    /**
     * ### EX 4 ###
     * Requirement Exercise 4: Given a number, if it’s equal to or higher
     * than 2 and equal to or lower than 8, print the number
     */
    public double checkNumberInterval(double givenNumber) {

        if(givenNumber >= 2 && givenNumber <= 8)
            return givenNumber;
        return givenNumber + 1.11;  // Unsatisfied condition case 'error' choice:
        // if the number is outside the range of the interval ,
        // the given number will be modified and printed
        //  the way it's been modified ( meaning added 1.11 chosen
        // value in this case to our given number)
    }

    /**
     * ### EX 5 ###
     * Requirement Exercise 5: Given a text input and a number input,
     * if the text is equal to "Evozon” AND the number is equal to or
     * lower than 3, print the text and the number. If the text is not “Evozon” AND
     * the number is equal to or higher than 4, print the number and the text, in this order.
     */
    public String noNtextOrTextNnoPrintout(String textInput, double numberInput) {

        String convertedNumberInput = String.valueOf(numberInput);

        if ( textInput.equals("Evozon") && numberInput <= 3 )
            return textInput + " " + convertedNumberInput;          // Will eventualy print the text given first then the number given
        else if (!textInput.equals("Evozon") && numberInput >= 4 )
            return   convertedNumberInput + " " + textInput;        // Will eventualy print the number given first then the text given

        return "Number is equal to Evozon and greater than 3 " +
                " OR the Number is not equal to ''Evozon'' and is below 4 " +
                "OR number is between 3 and 4 and the text is Indifferent / it's containing value does not matter, it will crash both tests anyway ! ";
    }

    /**
     * ### EX 6 ###
     * Requirement Exercise 6: Given a number input, if it is higher than 8 OR equal to 6, print “The amount
     * of snow this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
     */
    public String howMuchSnowWasThisWinter(double numberInput) {

        if(numberInput > 8 && numberInput <4)
            return "The amount of snow this winter was(cm):";
        else if(numberInput == 4)
            return "The forecast snow is(cm):" ;
        else if(numberInput <3)
            return "The number is lower than 3";
        return "";
    }


    /**
     * ### EX 7 ###
     * Exercise 7: Given a number input, if the number is greater than 3 but not equal to 4, print
     * “The number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print
     * ”The number is equal to 4”. Else if the number is lower than 3 print “The number is lower than 3”
     */
    public String howMuchSnowWasThisWintder(double numberInput) {

        if( numberInput > 3 && numberInput != 4 )
            return "The number is greater than 3 and not equal to 4";
        else if( numberInput == 4 )
            return "The number is equal to 4" ;
        else if( numberInput <3 )
            return "The number is lower than 3";
        return "Error!";
    }


    /**
     * ### EX 8 ###
     * Requirement Exercise 8: If the user pressed number keys( from 0 to 9), the program will tell the number
     * that is pressed,  otherwise, program will show "Not allowed”. (use a switch case for this)
     */
    public String howMudchSnowWasThisWintder() {
        ReadInput readInput = new ReadInput();
        Scanner scan = new Scanner(System.in);
        int i = readInput.readNumber();

        if ( i >=0 && i <= 9)
            switch(i){
                case '1':
                    return "The number you pressed is 1!";
                case '2':
                    return "The number you pressed is 2!";
                case '3':
                    return "The number you pressed is 3!";
                case '4':
                    return "The number you pressed is 4!";
                case '5':
                    return "The number you pressed is 5!";
                case '6':
                    return "The number you pressed is 6!";
                case '7':
                    return "The number you pressed is 7!";
                case '8':
                    return "The number you pressed is 8!";
                case '9':
                    return "The number you pressed is 9!";
                case '0':
                    return "The number you pressed is 0!";

                default:
                    return "Waiting for a number to be pressed..";
            }
        return "Error!";

    }


    /**
     * ### EX 10 ###
     * Requirement Exercise 10: Write a Java program to determine whether an input number is an even number.
     */
    public String isEvenNo(int number){

        if(number %2 == 0)
            return "The number given is even ";
        return "The number given is not even ";
    }


    /**
     * ### EX 11 ###
     * Requirement Exercise 11: Write Java program to allow the user to input his/her age. Then the program will show
     if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
     Enter your age: 18
     You are eligible to vote.
     */
    public static String giveYourAge(Scanner scanner){

        Scanner scannerr = scanner;
        int valueGivenInputByUser = scannerr.nextInt();
        if (valueGivenInputByUser >= 18)
            return "you are eligible to vote";
        else return "We're sorry, you unfortunately are unable to vote " ;

    }


    /**
     * ### EX 12 ###
     * Exercise 12: Write a Java program that determines a student’s grade.
     * The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
     * -if the average score >=90% =>grade=A
     * -if the average score >= 70% and <90% => grade=B
     * -if the average score>=50% and <70% =>grade=C
     * -if the average score<50% =>grade=F
     * See the example output below:
     * Quiz score: 80
     *
     * Mid-term score: 68
     *
     * Final score: 90
     *
     * Your grade is B.
     */
    public static String seeYourGradeGenius(Scanner scanner ) {
        Scanner scannerr = scanner;
        int quizScore = scannerr.nextInt();

        int midtermScore = scannerr.nextInt();
        int finalScore = scannerr.nextInt();
        int averageScore = midtermScore + finalScore /2 ;
        if( averageScore >= 9 )
            return "Your grade is A! Congratulations! ";

        else if ( averageScore >= 7 && averageScore < 9)
            return "Your grade is B! Good work! ";

        else if ( averageScore >= 7 && averageScore < 9)
            return "Your grade is C! You can improve! ";

        else if ( averageScore >= 7 && averageScore < 9)
            return "Your grade is F! Try to exercise more for next time! ";

        return "Error!";
    }




    /**  Requirement Exercise 15: Write a Java program to search for an element of an integer array of 10 elements.*/
    //public static void searchForElement(int[] ) {     }

    /** Requirement Exercise 16: Write a Java program by using two for loops to produce the output shown below:

     *******

     ******

     *****

     ****

     ***

     **

     *
     */

    public static void produceOutputShown() {

        for(int j = 7; j> 0; j--) {
            System.out.println("\n");
            for (int i = j; i > 0; i--)
                System.out.print("*");
        }
    }

    /** Exercise 17: Write a Java program by using three for loops to print the following pattern:

     1******

     12*****

     123****

     1234***

     12345**

     123456*

     1234567

     //Implementarea este facuta pentru afisarea fix pe dos ( de jos in sus in cazul de fata fata de exemplu )
     // se va remedia in cel mai scurt timp posibil ^_^
     */

    public static void printPatternThreeL() {

        int nr =0;
        for(int i = 7; i> 0; i--) {
            System.out.println("\n");

            nr=1;
            while(nr<i) {
                System.out.print(nr);
                nr++;
            }
            System.out.print("*");
        }
    }



    /**
     Exercise 18: Write a function that takes an input list and an interval n and returns a new list
     with all the elements of the original list, in order, except that every nth item has been removed.
     For instance, given the input list (1 2 3 4 5 6 7 8 9 10) and n = 4, the function should return the list (1 2 3 5 6 7 9 10).
     */
    public static void returnList(ArrayList<Integer> lista, int number) {

        int i =0 ;
        if( lista.contains(number) )
            Collections.sort(lista);
    }

}



