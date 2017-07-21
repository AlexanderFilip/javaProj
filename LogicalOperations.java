

/**
 * Created by cosminciocan on 17/07/2017.
 */

public class LogicalOperations {

    public int compareToValue(int noToCompare, int no){
        if(no < noToCompare)
            return no;
        return noToCompare;
    }

    public int compareBetweenValues(int noToCompare1,int noToCompare2, int no){
        if(no <= noToCompare1 || no >= noToCompare2)
            return no;
        return noToCompare1;
    }

    public int[] getValuesLessThan(int number, int noToCompare) {
        int[] array = new int[noToCompare - number];

        for(int i = 0; number < noToCompare; i++, number++) {
            array[i] = number;
        }

        return array;
    }
}
