import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, biyoloji;

        Scanner inp= new Scanner(System.in);

        System.out.println("Matematik notunuz giriniz");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz giriniz");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz giriniz");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz giriniz");
        turkce = inp.nextInt();

        System.out.println("Biyoloji notunuz giriniz");
        biyoloji = inp.nextInt();

        double toplam = (mat+fizik+kimya+turkce+biyoloji);
        double ortalama = toplam / 5;
        boolean sonuc= ortalama > 60;
        String str = sonuc ? "Ortalamanız 60'ın üzerinde" : "Kaldınız";
        System.out.println(str);
    }
}
