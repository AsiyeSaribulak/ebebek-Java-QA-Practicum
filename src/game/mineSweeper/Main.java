package game.mineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
            int row,col;
            System.out.println("Mayın Tarlası Oyuna Hosgeldiniz !\n" +
                               "İyi Eğlenceler !!! ");
            System.out.println("Lütfen Oynamak istediginiz Boyutlari Giriniz : ");
            System.out.println("Satir Sayisi : ");
            row=inp.nextInt();
            System.out.println("Sütun Sayisi : ");
            col= inp.nextInt();;

            MineSweeper mine=new MineSweeper(row,col);
            mine.run();


        }

}
