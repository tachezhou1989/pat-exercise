package tache.zhou.exervise.pat.selfTest;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/10 0010.
 */
public class ShufflingMachine {

    private static void printlnResult(int n) {

        int color = n / 13;
        if (n % 13 == 0) {
            color = n /13 -1;
        }
        switch (color) {
            case 0:
                System.out.print("S");
                break;
            case 1:
                System.out.print("H");
                break;
            case 2:
                System.out.print("C");
                break;
            case 3:
                System.out.print("D");
                break;
            default:
                System.out.print("J");
        }
        int reminder = n  % 13;
        if (reminder == 0) {
            System.out.print(13);
        } else {
            System.out.print(n % 13);
        }
    }

    private static void initArray(int[] intArray) {
        for (int i = 0; i < 55; i++) {
            intArray[i] = i;
        }

    }

    public static int[] shuffle(int n, int[] intArray) {
        int[] bShufflArray = new int[55];
        int[] aShullleArray = new int[55];
        initArray(bShufflArray);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 55; j++) {
                aShullleArray[intArray[j]] = bShufflArray[j];
            }
            //刚开始这里居然用了传索引的方式！
            for (int j = 1; j < 55; j++) {
                bShufflArray[j] = aShullleArray[j];
            }
        }
        return aShullleArray;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int shiftNo = cin.nextInt();
        int[] intArray = new int[55];
        for (int i = 1; i < 55; i++) {
            intArray[i] = cin.nextInt();
        }
        int resultArray[] = shuffle(shiftNo, intArray);
        for (int i = 1; i < 54; i++) {
            printlnResult(resultArray[i]);
            System.out.print(" ");
        }
        printlnResult(resultArray[54]);
    }
}
