package com.restep.multi;

import java.util.Date;
import java.util.Random;

/**
 * @author restep
 * @date 2019/3/8
 */
public class DieTest {
    private static Die die1;
    private static Die die2;

    public static void main(String[] args) {
        die1 = Die.getInstance(1);
        die2 = Die.getInstance(2);

        die1.dice();
        die2.dice();
    }
}

class Die {
    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private Die() {

    }

    public static Die getInstance(int whichOne) {
        if (whichOne == 1) {
            return die1;
        } else {
            return die2;
        }
    }

    public synchronized int dice() {
        Date d = new Date();

        Random r = new Random(d.getTime());
        int value = r.nextInt();
        value = Math.abs(value);

        value = value % 6;
        value += 1;
        System.out.println(value);
        return value;
    }
}
