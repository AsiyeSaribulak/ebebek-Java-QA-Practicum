package vücudKitleIndeksi;

import java.util.Scanner;

public class VctKitleIndeksi {
    public static void main(String[] args) {
        double boy;
        int kilo;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(metre cinsinden) giriniz : ");
        boy=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=scanner.nextInt();
        double index=kilo /(boy*boy);
        System.out.println("vücut kitle indeksiniz : " + index);


    }

}
