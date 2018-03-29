/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhg
 */
import java.io.*;
import java.util.*;

public class String2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = 0;
        int b = 0;
        int suma = 0;
        a = A.length();
        b = B.length();

        suma = a + b;

        System.out.println(suma);
        if (A.compareTo(B) != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) +
                " " + B.substring(0, 1).toUpperCase()+ B.substring(1));

    }
}
