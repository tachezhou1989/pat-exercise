package tache.zhou.exervise.pat.selfTest;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/7 0007.
 */
public class PrintHourglass {

    public static void printHourGlass(int starNum, String starShape) {
        int loopEndFlag = starNum;
        int loopNum = 1;
        while (true) {
            if (loopNum == 1) {
                loopEndFlag -= 1;
            } else {
                loopEndFlag -= 2 * ((2 * loopNum) - 1);
            }

            if (loopEndFlag < 0) {
                break;
            }

            loopNum ++;

        }
        loopNum -= 1;
        int remainStarNum = loopEndFlag + 2 * ((2 * (loopNum +1)) - 1);


        for(int i = loopNum; i >= 1; i--) {
            for(int j = 0; j < loopNum - i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i - 1); j++) {
                System.out.print(starShape);
            }
            System.out.println();
        }

        for(int i = 2; i <= loopNum; i++) {
            for(int j = 0; j < loopNum - i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i - 1); j++) {
                System.out.print(starShape);
            }
            System.out.println();
        }

        System.out.println(remainStarNum);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int num = cin.nextInt();
        String starShape = cin.next();
        printHourGlass(num, starShape);
    }
}

