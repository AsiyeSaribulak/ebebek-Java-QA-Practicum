package dongülerPratik1;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int kuvvet1=1;
        int kuvvet2=1;
        System.out.println("sayı giriniz:");
        int n= scanner.nextInt();
        System.out.println("4'ün katları");
        for(int i=0;i<=n;i++){
            kuvvet1= (int) Math.pow(4,i);
            System.out.println("kuvvet1:"+ kuvvet1 );
        }
        System.out.println("5'in katları");
        for(int i=0;i<=n;i++){
            kuvvet2=(int) Math.pow(5,i);
            System.out.println("kuvvet2:" + kuvvet2);
        }
    }

}
