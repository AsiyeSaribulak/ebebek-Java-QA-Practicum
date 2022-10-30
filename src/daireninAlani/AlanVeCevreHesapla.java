package daireninAlani;

import java.util.Scanner;

public class AlanVeCevreHesapla {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("dairenin yarı çapını giriniz: ");

        int r= scanner.nextInt();
        System.out.println("Merkez açısını giriniz: ");
        int a=scanner.nextInt();

        double alan=Math.PI*r*r* (a/360d);;
        System.out.println("dairenin alanı: "+ alan);
        double cevre=Math.PI*2*r;
        System.out.println("dairenin çevresi: "+ cevre);
    }
}
