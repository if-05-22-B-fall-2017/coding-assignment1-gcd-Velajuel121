/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdeuklid;

import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class GcdEuklid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl 1:");
        int n1 = sc.nextInt();
        System.out.println("Zahl 2:");
        int n2 = sc.nextInt();
        System.out.println("GCD-Euklid aus "+n1+" und "+n2+" ist: "+gcd(n1,n2));
    }
    public static int gcd(int a, int b)
    {
	while(b > 0)
	{
		int c = a % b;
		a = b;
		b = c;
	}
	return a;
    }
}
