package tache.zhou.exervise.pat.selfTest;

import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/9 0009.
 */
public class FunNum {

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        String numStr = cin.next();
        BigDecimal bigDecimal = new BigDecimal(numStr);
        String afterDoubleStr = (bigDecimal.multiply(new BigDecimal(2))) + "";

        Map<Character, Integer> numStrMap = new HashMap<Character, Integer>();
        for (int i = 0; i < numStr.length(); i++) {
            char key = numStr.charAt(i);
            Integer value = numStrMap.get(key);
            if (value != null) {
                numStrMap.put(key, value + 1);
            } else {
                numStrMap.put(key, 1);
            }
        }

        Map<Character, Integer> numStrDouMap = new HashMap<Character, Integer>();
        for (int i = 0; i < afterDoubleStr.length(); i++) {
            char key = afterDoubleStr.charAt(i);
            Integer value = numStrDouMap.get(key);
            if (value != null) {
                numStrDouMap.put(key, value + 1);
            } else {
                numStrDouMap.put(key, 1);
            }
        }

        boolean flag = true;
        if (numStrDouMap.size() != numStrMap.size()) {
            flag = false;
        } else {
            for (char key : numStrMap.keySet()) {
                Integer valueInNumStrMap = numStrMap.get(key);
                Integer valueInNumStrDouMap = numStrDouMap.get(key);
                if (valueInNumStrDouMap == null) {
                    flag = false;
                    break;
                }
                if (!valueInNumStrDouMap.equals(valueInNumStrMap)) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Yes");
            System.out.println(afterDoubleStr);
        } else {
            System.out.println("No");
            System.out.println(afterDoubleStr);
        }
    }
}
