package sinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat, chem, phys, hist, lessonCount;
        float av, sum = 0;
        Scanner scanner = new Scanner(System.in);

        //with every grade I checked if the code is greater or less than zero. If it is bigger, it doesn't count. If it is smaller, I summed the grade with sum variable.
        System.out.println("Enter your maths grade: ");
        lessonCount=0;

        mat= scanner.nextByte();
        if(mat<=100){
            sum+=mat;
            lessonCount+=1;
        }

        System.out.println("Enter your chemistry grade: ");
        chem= scanner.nextByte();
        if(chem<=100){
            sum+=chem;
            lessonCount+=1;
        }

        System.out.println("Enter your physics grade: ");
        phys= scanner.nextByte();
        if(phys<=100){
            sum+=phys;
            lessonCount+=1;
        }

        System.out.println("Enter your history grade: ");
        hist= scanner.nextByte();
        if(hist<=100){
            sum+=hist;
            lessonCount+=1;
        }

        //I found the average in here.
        av = sum/lessonCount;

        //with the grades I found last situation
        if(av>=55){
            System.out.println("You passed!");
        }
        else{
            System.out.println("You failed!");
        }

    }
}
