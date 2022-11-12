package plusNumber;

import java.util.Scanner;

public class PlusNumber {

   public static void plusNumber(int n){
        System.out.print(n+" ");
        if(n>0){
            plusNumber(n-5);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int n=input.nextInt();
        plusNumber(n);

    }
}
