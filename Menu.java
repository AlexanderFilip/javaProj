

import java.util.Scanner;

/**
 * Created by cosminciocan on 19/07/2017.
 */

 public class Menu {
    ReadInput readInput = new ReadInput();


    public void printOptions()
    {
//        System.out.println("Meniul este: \n" +
//                "1. Adunare\n" +
//                "2. Scadere\n" +
//                 "0. LogOut");
                  System.out.println(" ###################################### MENU ################################################ \n" +


                        "Operatii Aritmetice: \n\n" +

                            "1. Sum of two numbers \n" +
                            "2. Difference of two numbers \n " +
                            "3. Multiplication of two numbers \n "  +
                            "4. Division of two numbers \n " +
                            "5. Square of given number\n " +
                            "6. Cubic value \n\n" +
                            "7. Value Less Than a Number "  +
                            "8. Compare to a Value  " +
                            "9. Compare Between Values  " +

                     "Cerinte implementate \n\n" +

                        "10. Convert temperature from F to C\n" +
                        "11. Print the greatest number\n" +
                        "12. Given a text input, if it is \'Evozon\', then print \'Learning text comparison\'. If not, print \'Got to try some more\'\n" +
                        "10. Given a number, if it\'+s equal to or higher than 2 and equal to or lower than 8, print the number\n" +
                        "11. Given a text input and a number input, if the text is equal to \'Evozon\' AND the number is equal to or lower\n" +
                        "than 3, print the text and the number. If the text is not \'Evozon\' AND the number is equal to or higher than 4, print\n" +
                        "the number and the text, in this order\n" +
                        "12. Given a number input, if it is higher than 8 OR equal to 6, print \'The amount of snow this winter was(cm):\'\n" +
                        "and the given number. Else print \'The forecast snow is(cm):\'\n" +
                        "13. Given a number input, if the number is greater than 3 but not equal to 4, print \'The number is greater than\n" +
                        "3 and not equal to 4\'. Else if the number is equal to 4 print \'The number is equal to 4\'. Else if the number is lower\n" +
                        "than 3 print \'The number is lower than 3\'\n" +
                        "14. If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,  otherwise,\n" +
                        "program will show \'Not allowed\'\n" +
                        "15. Write a Java program to determine whether an input number is an even number\n" +
                        "16. Write Java program to allow the user to input his/her age. Then the program will show if the person is\n" +
                        "eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old\n" +
                        "17. Write a Java program that determines a student\'s grade.\n" +
                        "The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade\n" +
                        "18. Write a Java program that allows the user to choose the correct answer of a question\n" +
                        "19. Write a Java program to search for an element of an integer array of 10 elements\n" +
                        "20. Write a Java program by using two for loops to produce the output shown in \'Exercices in Java.txt\'\n" +
                        "21. Write a Java program by using three for loops to print the patter shown in \'Exercices in Java.txt\'\n" +
                        "22. Write a function that takes an input list and an interval n and returns a new list with all the elements of\n" +
                        "the original list, in order, except that every nth item has been removed\n\n" +
                        "###################################### END MENU ###########################################");



//           System.out.println(" ###################################### MENU ################################################ \n" +
//                                "1. Convert temperature from F to C\n" +
//                                "2. Print the greatest number\n" +
//                                "3. Given a text input, if it is \'Evozon\', then print \'Learning text comparison\'. If not, print \'Got to try some more\'\n" +
//                                "4. Given a number, if it\'+s equal to or higher than 2 and equal to or lower than 8, print the number\n" +
//                                "5. Given a text input and a number input, if the text is equal to \'Evozon\' AND the number is equal to or lower\n" +
//                                "than 3, print the text and the number. If the text is not \'Evozon\' AND the number is equal to or higher than 4, print\n" +
//                                "the number and the text, in this order\n" +
//                                "6. Given a number input, if it is higher than 8 OR equal to 6, print \'The amount of snow this winter was(cm):\'\n" +
//                                "and the given number. Else print \'The forecast snow is(cm):\'\n" +
//                                "7. Given a number input, if the number is greater than 3 but not equal to 4, print \'The number is greater than\n" +
//                                "3 and not equal to 4\'. Else if the number is equal to 4 print \'The number is equal to 4\'. Else if the number is lower\n" +
//                                "than 3 print \'The number is lower than 3\'\n" +
//                                "8. If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,  otherwise,\n" +
//                                "program will show \'Not allowed\'\n" +
//                                "9. Write a Java program to determine whether an input number is an even number\n" +
//                                "10. Write Java program to allow the user to input his/her age. Then the program will show if the person is\n" +
//                                "eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old\n" +
//                                "11. Write a Java program that determines a student\'s grade.\n" +
//                                "The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade\n" +
//                                "12. Write a Java program that allows the user to choose the correct answer of a question\n" +
//                                "13. Write a Java program to search for an element of an integer array of 10 elements\n" +
//                                "14. Write a Java program by using two for loops to produce the output shown in \'Exercices in Java.txt\'\n" +
//                                "15. Write a Java program by using three for loops to print the patter shown in \'Exercices in Java.txt\'\n" +
//                                "16. Write a function that takes an input list and an interval n and returns a new list with all the elements of\n" +
//                                "the original list, in order, except that every nth item has been removed\n\n" +
//                                "###################################### END MENU ###########################################");
    }

        public void SumOfTwoNumbers() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            Calculator calculator = new Calculator();
            System.out.println("Rezultatul este: ");
            System.out.println(calculator.sum(nr1, nr2) );

        }


        public void DifferenceBetweenTwoNumbers() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            Calculator calculator = new Calculator();
            System.out.println("Rezultatul este: ");
            System.out.println(calculator.diff(nr1, nr2) );
        }


        public void MultiplicationBetweenTwoNumbers() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            Calculator calculator = new Calculator();
            System.out.println("Rezultatul este: ");
            System.out.println(calculator.diff(nr1, nr2) );
        }


        public void DivisionByTwoNumbers() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            Calculator calculator = new Calculator();
            System.out.println("Rezultatul este: ");
            System.out.println(calculator.diff(nr1, nr2) );
        }


        public void SquareOfNumber() {

            System.out.println("Introdu numarul : ") ;
            int nr = readInput.readNumber();
            Calculator calculator = new Calculator();
            System.out.println("Rezultatul este: ");
            System.out.println(calculator.square(nr) );
        }


        public void CubicOfNumber() {

            System.out.println("Introdu numarul : ");
            int nr = readInput.readNumber();
            Calculator calculator = new Calculator();
            System.out.println("Rezultatul este: ");
            System.out.println(calculator.cubic(nr));

        }


        public void compareToValue() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Rezultatul este: ");
            System.out.println(logics.compareToValue(nr1, nr2));
        }


        public void compareBetweenValues() {

            System.out.println("Introdu trei numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            System.out.println("Al treilea numar : ");
            int nr3 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Rezultatul este: ");
            System.out.println(logics.compareBetweenValues(nr1, nr2, nr3));
        }


        public void getValuesLessThan() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));
        }


        public void Exercise1() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise2() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise3() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise4() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise5() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise6() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise7() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise8() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise9() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise10() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise11() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise12() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }

        public void Exercise13() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise14() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


        public void Exercise15() {

            System.out.println("Introdu doua numere.");
            System.out.println("Primul numar : ");
            int nr1 = readInput.readNumber();
            System.out.println("Al doilea numar : ");
            int nr2 = readInput.readNumber();
            LogicalOperations logics = new LogicalOperations();
            System.out.println("Numerele mai mici decat %nr2 este: " );
            System.out.println(logics.getValuesLessThan(nr1, nr2));

        }


    public boolean chooseOption(int option){

        switch (option){
            case 0:
                System.out.println("You have logged out. Goodbye! ");    //int nr3=readInput.readNumber();
                return false;

            case 1:
                SumOfTwoNumbers();
                break;

            case 2:
                DifferenceBetweenTwoNumbers();

            case 3:
                MultiplicationBetweenTwoNumbers();

            case 4:
                DivisionByTwoNumbers();

            case 5:
                SquareOfNumber();

            case 6:
                CubicOfNumber();

            case 7:
                getValuesLessThan();

            case 8:
                compareToValue();

            case 9:
                compareBetweenValues();

//            case 10:
//                Exercise1();
//
//
//            case 10:
//                Exercise2();
//
//
//            case 10:
//                Exercise3();
//
//
//            case 10:
//                Exercise4();
//
//
//            case 10:
//                Exercise5();
//
//
//            case 10:
//                Exercise6();
//
//
//            case 10:
//                Exercise7();
//
//
//            case 10:
//                Exercise8();
//
//
//            case 10:
//                Exercise9();
//
//
//            case 10:
//                Exercise10();
//
//
//            case 10:
//                Exercise11();
//
//
//            case 10:
//                Exercise12();
//
//
//            case 10:
//                Exercise13();
//
//
//            case 10:
//                Exercise14();
//
//
//            case 10:
//                Exercise15();




            default:
                System.out.println("");
        }
        return true;
    }



    public void runProgram()
    {

        int option;
        do{  printOptions();
            System.out.println("Alege optiunea: ");
            option = readInput.readNumber();

        }
        while(chooseOption(option));
    }




}
