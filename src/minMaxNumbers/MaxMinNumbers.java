package minMaxNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[]args){
        int number;
        Scanner inp=new Scanner(System.in);
        int [] list={15,12,788,1,-1,-788,2,0};//dizi oluştur
        System.out.println("Dizi : "+ Arrays.toString(list));
        System.out.print("Girilen Sayı : ");//minimun sayıyı gir
        number=inp.nextInt();
        Arrays.sort(list);//sırala
        int min =list[0];
        int max=list[7];
        for (int i:list){//girilen sayıya göre en yakın minumum sayıyı ve en yakın maximum sayıyı bulur.
            if (i<max&&i>number){
                max=i;
            }
            if (i>min&&i<number){
                min=i;
            }
        }
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
    }
}
