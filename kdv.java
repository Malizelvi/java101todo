import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double  tutar, kdvOran = 0.18 ;

        Scanner inp = new Scanner(System.in);
        System.out.printf("Lütfen tutarı giriniz : ");
        tutar = inp.nextDouble();

        double kdvlitutar = tutar * kdvOran;

        System.out.println("KDV'siz fiyat: "+ tutar);
        System.out.println("KDV'li fiyat: "+ (tutar += (tutar*kdvOran)));
        System.out.println("KDV tutarı: "+ kdvlitutar);
        System.out.println("KDV orani: " + "%18");

    }
}
