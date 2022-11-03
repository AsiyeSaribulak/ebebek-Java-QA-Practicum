package dongülerPratik1;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float kombinasyon=1;
        System.out.println("kaç elemanlı : ");
        int n= scanner.nextInt();
        System.out.println("kaç kombinasyonlu : ");
        int r= scanner.nextInt();
        kombinasyon=fact(n)/(fact(r)*fact(n-r));
        System.out.println("kombinasyon:" + kombinasyon);

    }

    public static int fact(int n){
        int toplam=1;
        for(int i=1;i<=n;i++){
            toplam *=i;
        }
        return toplam;
    }

}
