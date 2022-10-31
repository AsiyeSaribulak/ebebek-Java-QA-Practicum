package etkinlikOnerme;

import java.util.Scanner;

public class EtkinlikOnerme {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz: ");
        double heat = scanner.nextDouble();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(heat >= 5 && heat < 15){

            if(heat >= 10){
                System.out.println("Bu hava durumunda sana önerebileceğim 2 etkinlik var.\n");
                System.out.println("Sinemaya veya pikniğe gidebilirsin.");
            }else{
                //only cinema
                System.out.println("Sinemaya gidebilirsin");
            }

        }else{
            System.out.println("Denize yüzmeye gidebilirsin.");
        }

    }
}
