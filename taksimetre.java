package Giris;
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int yol;
        double kmfiyat = 2.20;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yolunuzu KM cinsinden giriniz; ");
        yol = inp.nextInt();

        double tutar = yol * kmfiyat;
        // taksimetre açılış ücreti 10 tl dir
        tutar += 10;
        // tutar 20 tl altında olamaz
        tutar = (tutar<20) ? 20 :tutar;

        System.out.println("Ödenecek tutar: "+ tutar);


    }
}
