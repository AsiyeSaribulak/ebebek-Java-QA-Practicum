package exponentiation;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        int a = input.nextInt();
        System.out.print("Üs değerini girin: ");
        int b = input.nextInt();
        System.out.println("Sonuç: " + exponentCalc(a, b));


    }
    static int exponentCalc(int a, int b) {//üs hesabı yaplmak için oluşturulan dfonksiyon
        if (b == 0) return 1;
        else return a * exponentCalc(a, b - 1);
    }
}
