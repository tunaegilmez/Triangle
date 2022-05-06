import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        int a , b ;
        double c ;

        Scanner scn = new Scanner(System.in);

        System.out.print("ilk kenarı girin : ");
        a = scn.nextInt();
        System.out.print("ikinci kenarı girin : ");
        b = scn.nextInt();

        c = Math.sqrt((a * a) + (b * b)) ;
        System.out.println("hipotenüs : " + c);
    }
}
