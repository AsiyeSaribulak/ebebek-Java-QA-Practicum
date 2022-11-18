package palindrome;

import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String word = input.nextLine();

        if (isPalindrome2(word)) {
            System.out.println(word + " Palindromik kelimedir.");
        } else {
            System.out.println(word + " Palindromik kelime değildir.");
        }
    }

    static boolean isPalindrome(String str) {//palindrom olup olmadığını kontrol eder
        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindrome2(String str) {//girilen kelimenin tersini alan fonk
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("kelime: " + str);
        System.out.println("tersi: " + reverse);
        return str.equals(reverse);

    }

}

