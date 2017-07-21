

//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOperations logicalOp = new LogicalOperations();
        ReadInput readInput = new ReadInput();
//        System.out.println("Introduceti 2 numere");
////        System.out.println("The result is: " + calc.sum(readInput.readNumber(), readInput.readNumber()));
//        System.out.print("Introduceti numarul: ");
//        System.out.println("Rezultatul compararii este: " + logicalOp.compareToValue(10, readInput.readNumber()));
//
        //System.out.print("Introduceti numarul: ");
//        System.out.println("Rezultatul compararii intre valori este: " + logicalOp.compareBetweenValues(10,15, readInput.readNumber()));
//        int b=readInput.readNumber();
        //int i = readInput.readNumber();
        //System.out.print("Numerele mai mici decat 10 sunt: ");
        //int n = 10;
//        while(b<n)
//        {
//
//            System.out.print(b);
//
//            b++;
//            if(b==n)
//                System.out.println(".");
//            else
//                System.out.print(",");
//
//        }
//
//
//

//        for(; i < n; i++) {
//            System.out.print(i);
//            if(i == n-1) {
//                System.out.print(".");
//            }
//            else {
//                System.out.print(",");
//            }
//
//        }
//
//

//        int[] array = logicalOp.getValuesLessThan(i,n);
//        for(int j = 0; j < array.length; j++) {
//            System.out.print(array[j]);
//            System.out.print(j == array.length-1? ".":",");
//        }

//        List<Integer> lista = new ArrayList<Integer>();
//        for(;i<10;i++) {
//            if (i % 2 == 0 ) {
//                lista.add(i);
//            }
//        }
//        System.out.print(lista);


//
//        Exercise 18: Write a function that takes an input list
// and an interval n and returns a new list with all the elements
// of the original list, in order, except that every nth item has
// been removed. For instance, given the input
// list (1 2 3 4 5 6 7 8 9 10) and n = 4, the function should
// return the list (1 2 3 5 6 7 9 10).

//        int number = i;
//
//        if (lista.contains(i))
//            lista.remove(i);
//
//        Collections.sort(lista);
//        System.out.println(lista.toString());

        //List<Integer> array = new ArrayList<Integer>();
//        for(int i = 4; i >= 0; i--) {
//            array.add(i+1);
//        }
//        array.add(2);
//        array.add(1);
//        array.add(5);
//        array.add(4);
//        array.add(3);
//        array.remove(Integer.valueOf(3));
//        System.out.println(array);

//        boolean swapped = true;
//        int j = 0;
//        int tmp;
//        while (swapped) {
//            swapped = false;
//            j++;
//            for (int i = 0; i < array.size() - j; i++) {
//                if (array.get(i) > array.get(i + 1)) {
//                    tmp = array.get(i);
//                    array.set(i, array.get(i + 1));
//                    array.set(i + 1, tmp);
//                    swapped = true;
//                    System.out.println(array);
//                }
//            }
//        }


//
//        n = 2;
//        List<Integer> newArray = new ArrayList<Integer>();
//
//        for(int i = 0; i < array.size(); i++) {
//            if(!((i +1 ) % n == 0)) {
//                newArray.add(array.get(i));
//            }
//        }
//        System.out.println(newArray);


//        TreeMap<String, Integer> hashmap = new TreeMap<String, Integer>();
//        //scanner scan = new Scanner(System.in);
////        hashmap.put("unt",5);
////        hashmap.put("inghetata",2);
////        hashmap.put("salata",8);
////        hashmap.put("portocale",6);
////        hashmap.put("portocale",8);
////         int a = readInput.readNumber();
////        String b = readInput.readString();
////        hashmap.put("cheie", a);
////        hashmap.put(b, a);
//        // hashmap.clear();
//        //hashmap.remove("salata");
//        //  System.out.println("Produsele din cos sunt: "+hashmap);
//
//        int n = readInput.readNumber();
//
//        for (int i = 0; i < n; i++) {
//            String b = readInput.readString();
//            int a = readInput.readNumber();
//
//            hashmap.put(b, a);
//
//
//        }
//        System.out.println(hashmap);
        Menu m = new Menu();

        Login login = new Login();
        if(login.loginValidation()){
            m.runProgram();
        }


       // m.chooseOption(readInput.readNumber());


    }
}
