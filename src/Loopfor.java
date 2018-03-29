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
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loopfor {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0;
        for (int i=1; i<=10; i++)
            {result= N * i;
            System.out.println(N + " x "+ i +" = " + result);}
    }
}

    

