package repeatingNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruquencyElement {//dizideki elemanların kaç kez tekrar edildiğini
                                // yani frekanslarını bulan program

    public static void main(String[] args) {
        int [] array = {10, 20, 20, 10, 10, 20, 5, 20};
        List<Integer> arr = new ArrayList<>();
        int counter = 0;

        System.out.println("Dizi : "+ Arrays.toString(array));
        System.out.println("Tekrar Sayıları");
        for(int i=0; i<array.length; i++){
            for(int j=0; j< array.length; j++){
                if(array[i] == array[j]){
                    counter++;//sayacı arttır
                }
            }
            if(!(arr.contains(array[i])) && counter >0 ){
                arr.add(array[i]);
                System.out.println(array[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 0;

        }
    }
}