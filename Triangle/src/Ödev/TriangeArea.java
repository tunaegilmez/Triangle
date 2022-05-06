package Ödev;

import java.util.Scanner;

public class TriangeArea {
    public static void main(String[] args) {
        int cevre , u , a , b , c ;
        double alan ;
        Scanner scn = new Scanner(System.in);

        System.out.print("1. kenar : ");
        a = scn.nextInt();
        System.out.print("2. kenar : ");
        b = scn.nextInt();
        System.out.print("3. kenar : ");
        c = scn.nextInt();

        u = (a+b+c)/2 ;
        cevre = 2*u ;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c)) ;

        System.out.println("çevresi : " + cevre);
        System.out.println("alan : " + alan);
    }
}
