package dongülerPratik1;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        int toplam=0;
       do {
           System.out.println("sayı giriniz:");
           n= scanner.nextInt();
           if(n%2==0){
               if( n%4==0){
                    toplam +=n;
               }else{
                   continue;
               }
           }

       }while(n%2==0);
        System.out.println("toplam: " + toplam);
    }
}
