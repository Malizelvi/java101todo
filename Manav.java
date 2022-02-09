package Giris;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, tutar;
        double a = 2.14, e = 3.67, d = 1.11, m = 0.95 ,p =5.00 ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç kg armut? : ");
        armut = inp.nextDouble();
        System.out.println("Kaç kg elma? : ");
        elma = inp.nextDouble();
        System.out.println("Kaç kg domates? : ");
        domates = inp.nextDouble();
        System.out.println("Kaç kg muz? : ");
        muz = inp.nextDouble();
        System.out.println("Kaç kg patlican? : ");
        patlican = inp.nextDouble();

        tutar =((a*armut)+(elma*e)+(domates*d)+(m*muz)+(patlican*p));
        System.out.println("Tutar : "+ tutar);
    }
}
