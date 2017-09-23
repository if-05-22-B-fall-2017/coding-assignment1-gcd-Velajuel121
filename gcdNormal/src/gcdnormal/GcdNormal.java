/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdnormal;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class GcdNormal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl 1:");
        int n1 = sc.nextInt();
        System.out.println("Zahl 2:");
        int n2 = sc.nextInt();
        System.out.println("GCD aus "+n1+" und "+n2+" ist: "+gcd(n1,n2));
    }
    public static int gcd(int a, int b){
        int factor = Math.min(a, b);
        for(int i = factor;i > 1;i--){
           if(a % i == 0 && b % i == 0){
              return i;
           }
        }
        return 1;
    }
}
