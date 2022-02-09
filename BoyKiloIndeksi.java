package Giris;

import java.util.Scanner;

public class BoyKiloIndeksi {
    public static void main(String[] args) {
    double kilo, boy, index;

    Scanner inp = new Scanner(System.in);

    System.out.println("Lütfen Kilonuzu kg cinsinden Giriniz: ");
    kilo = inp.nextDouble();

    System.out.println("Lütfen Boyunuzu m cinsinden Giriniz: ");
    boy = inp.nextDouble();

    index = kilo /(boy * boy) ;
        System.out.println("Vücüt Kitle İndexiniz: "+index);

        if (index < 18.4) {
            System.out.println("zayıf");
        }
        else if (18.4 < index && index < 25 )
        {System.out.println("normal");}
        else if ( 24.9 < index && index < 30 ){
        System.out.println("kilolu");}
        else if (29.9 < index ){
        System.out.println("obez");}

    }
}
