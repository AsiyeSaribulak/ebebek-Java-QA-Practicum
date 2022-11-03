package dongülerPratik1;

import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("üssü alınacak sayı");
        int toplam=1;
        int sayi=scanner.nextInt();
        System.out.println("üs olacak sayı");
        int üs=scanner.nextInt();
        for (int i=1;i<=üs;i++){

                toplam*=sayi;

        }
        System.out.println(sayi+"^"+üs + "=" + toplam);
    }
}
