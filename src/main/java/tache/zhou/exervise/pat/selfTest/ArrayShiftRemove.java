package tache.zhou.exervise.pat.selfTest;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/8 0008.
 */
public class ArrayShiftRemove {

    public static void shiftRemve(Integer[] intArray, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = intArray.length - 1; j >0; j--) {
                int temp = intArray[j];
                intArray[j] = intArray[j - 1];
                intArray[j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int arraySize = cin.nextInt();
        int shiftNo = cin.nextInt();
        Integer[] intArray = new Integer[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = cin.nextInt();
        }
        shiftRemve(intArray,shiftNo);
        for (int i = 0; i < arraySize - 1; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.print(intArray[arraySize - 1]);
    }
}
