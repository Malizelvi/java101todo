import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ucgenAlanHesaplayici {
    public static void main(String[] args) {
        double   a, b, c, u, cevre, alan ;
        Scanner inp = new Scanner(System.in);


        System.out.println("a kenarını giriniz:");
        a = inp.nextDouble();

        System.out.println("b kenarını giriniz:");
        b = inp.nextDouble();

        System.out.println("c kenarını giriniz:");
        c = inp.nextDouble();

        u = (a+b+c)/2;
        cevre  = 2 * u ;
        alan = sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("u : "+ u);
        System.out.println("Üçgenin Çevresi : "+ cevre);
        System.out.println("Üçgenin alanı   : "+ alan);



    }



}
