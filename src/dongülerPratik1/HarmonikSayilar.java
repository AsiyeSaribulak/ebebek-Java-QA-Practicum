package dongülerPratik1;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args){
        double num;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        num=input.nextInt();
        double harmonicSeries=0;
        for(int i=1;i<=num;i++){
            harmonicSeries+=1.0/i;
        }
        System.out.println("Result:"+harmonicSeries+1);
    }
}

