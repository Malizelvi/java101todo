import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        int r ;
        double pi = 3.14, cevre, alan, dilimAlan, alfa;

        Scanner inp = new Scanner(System.in);

        System.out.println("Alfa açısını derece biçimnide giriniz: ");
        alfa= inp.nextDouble();
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();

        cevre = 2* pi *r;
        alan= pi * r * r;
        dilimAlan =(pi*(r*r)*alfa)/360;
        System.out.println("Dairenin çevresi: "+ cevre);
        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Alfa açısnın kestiği alan: "+ dilimAlan);
    }
}
