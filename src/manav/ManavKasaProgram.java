package manav;

import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut;
        double elma;
        double domates;
        double muz;
        double patlıcan ;
        double tutar=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Armut kaç kilo ? :");
        armut=scanner.nextDouble();
        System.out.println("Elma kaç kilo ? :");
        elma=scanner.nextDouble();
        System.out.println("Domates kaç kilo ? :");
        domates=scanner.nextDouble();
        System.out.println("Muz kaç kilo ? :");
        muz=scanner.nextDouble();
        System.out.println("Patlıcan kaç kilo ? :");
        patlıcan=scanner.nextDouble();
        tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5);
        System.out.println("Toplam Tutar :  " + tutar + "TL");
    }
}
