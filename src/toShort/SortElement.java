package toShort;

import java.util.Scanner;

public class SortElement {

    public static void main(String[] args) {
        int size;
        int[] array;
        int[] sortArray;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        size = inp.nextInt();
        array = new int[size];
        sortArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". eleman : ");
            array[i] = inp.nextInt();
        }

        for (int j = 0; j < array.length; j++) {
            sortArray[j] = minElement(array);
        }
        System.out.println("Sıralanmış dizi : " + printArray(sortArray));

    }
    static int minElement(int[] arr) {//en küçük elemanı bulmak için yazılan fonk.
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        arr[index] = Integer.MAX_VALUE;
        return min;
    }

    static String printArray(int[] arr){//diziyi yazdırmak için fonk. yazıldı
        String str="";
        for (int i : arr){
            str+= i +" ";
        }
        return str;
    }
}
