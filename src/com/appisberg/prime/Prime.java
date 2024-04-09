package com.appisberg.prime;

import java.util.ArrayList;

/**
* This program will find the highest prime number it can within 5 seconds.
*
* @author Beth Williams
* @version 1.0
 */
public class Prime {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();       //array list to store any prime numbers found
        primes.add(2);                                       //include '2' as default
        //System.out.println(2);

        boolean factor = false;     //in case extant factor
        int i = 3;                  //start searching from 3

        long startTime = System.currentTimeMillis();        //store current time for timer
        long elapsedTime;

        do {
            //check if i is prime - look for factors within array of prime numbers already found
            for (int p : primes) {
                //if a factor exists, set boolean and stop searching
                if (i % p == 0) {
                    factor = true;
                    break;
                }
            }
            //add i to list and print if no factor exists
            if (!factor) {
                primes.add(i);
                //System.out.println(i);
            }

            factor = false;     //unset boolean
            i += 2;             //skip even numbers

            elapsedTime = System.currentTimeMillis() - startTime;       //update time elapsed
        } while (elapsedTime < 5*1000);                                //run for 5 seconds
	System.out.println("Highest prime number found in 5 seconds: " + primes.get(primes.size()-1)); 
    }
}
