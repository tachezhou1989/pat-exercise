package tache.zhou.exervise.pat.selfTest;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/8 0008.
 */
public class PrimerPair {

    private static boolean isPrimer(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimerPair(int n) {
        int primerPairNum = 0;
        int beforePrimer = 2;
        int currentPrimer = 0;
        for (int i = 2; i <= n; i++) {
            if(isPrimer(i)) {
                currentPrimer = i;
                if (currentPrimer - beforePrimer == 2) {
                    primerPairNum ++;
                }
                beforePrimer = currentPrimer;
            }

        }

        return primerPairNum;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int num = cin.nextInt();
        System.out.println(countPrimerPair(num));
    }
}
