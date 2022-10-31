package kullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Kayıt olmak için kullanıcı adınızı giriniz: ");
        String ID = sc.nextLine();
        System.out.println("Belirlediğiniz şifreyi girin: ");
        String pas1 = sc.nextLine();
        System.out.println("Lütfen tekrar girin: ");
        String pas2 = sc.nextLine();

        if(pas1.equals(pas2))
        {
            System.out.println("Şifreniz onaylandı.\n Giriş yapmak için 1'i Çıkmak için 2 yi tuşlayın:");
            i = sc.nextByte();
            if(i==1)
            {
                System.out.println("Kullanıcı adı:");
                sc.nextLine();
                String ID1 = sc.nextLine();
                System.out.println("Şifre:");
                String pas3 = sc.nextLine();
                if(ID1.equals(ID) && pas1.equals(pas3))
                {
                    System.out.println("Hoşgeldiniz!");
                }
                else
                {
                    System.out.println("Yanlış kullanıcı adı ya da şifre.");
                }
            }
        }
        else
        {
            System.out.println("Şifreler uyuşmuyor.");
            System.out.println("İlk girdiğiniz şifre: "+pas1);
            System.out.println("İkinci girdiğiniz şifre: " + pas1);
        }
    }
}
