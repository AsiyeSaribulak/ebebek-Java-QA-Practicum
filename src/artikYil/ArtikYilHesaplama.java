package artikYil;


import java.util.Scanner;

public class ArtikYilHesaplama {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Yil giriniz: ");
            int year = in.nextInt();
            if (year % 400 == 0) {
                System.out.println(year + " bir artik yil.");
            } else {
                System.out.println(year + " bir artik yil degil.");
            }
        }
    }

